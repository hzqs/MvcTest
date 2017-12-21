import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by hzq on 2017/12/18.
 */
public class Test {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, InstantiationException {
        Map<String,Object>map=new HashMap<>();
        map.put("a",5);
        map.put("b",100);
        map.put("c","abc");

        MyHandler handler=new MyHandler();

        Method[] methods=handler.getClass().getDeclaredMethods();

        for(Method method:methods){
            if(method.getName().equals("testa")){
                Object[] values=null;
                int count=method.getParameterCount();
                for(int i=0;i<count;i++){
                    Parameter parameter=method.getParameters()[i];
                    values[i] = ConvertUtils.convert(map.get(parameter.getName()), parameter.getType());
                }
                method.invoke(handler,values);
            }else if(method.getName().equals("testb")){
                Parameter parameter=method.getParameters()[0];
                Object paramObject=parameter.getType().newInstance();
                BeanUtils.populate(paramObject,map);
                method.invoke(handler,paramObject);
            }


        }
    }
}
