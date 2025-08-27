import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflexao {

    public static void listarInformacoes(Object obj) {
        Class<?> classe = obj.getClass();
        System.out.println("Classe: " + classe.getSimpleName());
        listarAtributos(classe);
        listarMetodos(classe);
    }

    private static void listarAtributos(Class<?> clazz) {
        if (clazz == null || clazz == Object.class) return;

        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Atributo: " + field.getName() + " (da classe " + clazz.getSimpleName() + ")");
        }

        listarAtributos(clazz.getSuperclass());
    }

    private static void listarMetodos(Class<?> clazz) {
        if (clazz == null || clazz == Object.class) return;

        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Método: " + method.getName() + " (da classe " + clazz.getSimpleName() + ")");
        }

        listarMetodos(clazz.getSuperclass());
    }
}
