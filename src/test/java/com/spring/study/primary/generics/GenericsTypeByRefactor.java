package com.spring.study.primary.generics;

/**
 * @author zhangfei
 * @version 1.0
 * @date 2021-07-17 22:39
 */
public class GenericsTypeByRefactor {
//    private Map<String, Integer> map = new HashMap<String, Integer>();
//    public static void main(String[] args) throws Exception {
//        Field field = GenericsTypeByRefactor.class.getDeclaredField("map");
//        field.setAccessible(true);
//        Type genericType = field.getGenericType();
//        if (genericType instanceof ParameterizedType) {
//            ParameterizedType parameterizedType = (ParameterizedType)genericType;
//            System.out.println(parameterizedType.getActualTypeArguments());
//            System.out.println(Arrays.toString(parameterizedType.getActualTypeArguments()));
//        }
//    }


//    public static void main(String[] args) throws Exception {
//        Method method = GenericsTypeByRefactor.class.getDeclaredMethod("test", List.class);
//        Type genericReturnType = method.getGenericReturnType();
//        System.out.println("genericReturnType = " + genericReturnType);
//        if (genericReturnType instanceof ParameterizedType) {
//            System.out.println(((ParameterizedType) (genericReturnType)).getActualTypeArguments()[0]);
//        }
//    }
//    public List<Integer> test(List<String> t) {
//        return new ArrayList<Integer>();
//    }

//    public static void main(String[] args) throws Exception {
//        Method method = GenericsTypeByRefactor.class.getDeclaredMethod("test", List.class);
//        Type[] genericParameterTypes = method.getGenericParameterTypes();
//        if(genericParameterTypes[0] instanceof ParameterizedType){
//            System.out.println(((ParameterizedType) (genericParameterTypes[0])).getActualTypeArguments()[0]);
//        }
//    }
//    public List<Integer> test(List<String> t){
//        return new ArrayList<Integer>();
//    }

//    public static void main(String[] args) throws NoSuchMethodException {
//        Constructor<GenericsTypeByRefactor> constructor = GenericsTypeByRefactor.class.getConstructor(List.class);
//        Type[] genericParameterTypes = constructor.getGenericParameterTypes();
//        Type type = ((ParameterizedType) (genericParameterTypes[0])).getActualTypeArguments()[0];
//        System.out.println(type);
//    }
//    public GenericsTypeByRefactor(List<String> list) {
//
//    }


}
