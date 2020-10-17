/**
 * 
 */
package ru.akbars.integro.creapp;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Map;
import java.util.Map.Entry;
import java.util.logging.Logger;
import java.util.TreeMap;

/**
 * @author rusile
 *
 */
public class ClassValuesCopier {
	
	private static final Logger LOG = Logger.getLogger(ClassValuesCopier.class.getName());
	
	public static int copy(final Object from, final Object to) {
		int rc = 0;
        Map<String, Field> fromFields = analyze(from);
        Map<String, Field> toFields = analyze(to);
        fromFields.keySet().retainAll(toFields.keySet());
        for (Entry<String, Field> fromFieldEntry : fromFields.entrySet()) {
            final String name = fromFieldEntry.getKey();
            final Field sourceField = fromFieldEntry.getValue();
            final Field targetField = toFields.get(name);
            
            LOG.info(">> name="+name+"; sourceField="+sourceField.toString()+"; targetField="+targetField.toString());
            
            if (targetField.getType().isAssignableFrom(sourceField.getType())) {
                sourceField.setAccessible(true);
                if (Modifier.isFinal(targetField.getModifiers())) continue;
                targetField.setAccessible(true);
                try {
                    targetField.set(to, sourceField.get(from));
                    rc++;
                } catch (IllegalAccessException e) {
                    //throw new IllegalStateException("Can't access field!");
                	LOG.info("Can't access field! Name="+name);
                }
            }
        }
        return rc;
    }

    private static Map<String, Field> analyze(Object object) {
        if (object == null) throw new NullPointerException();

        Map<String, Field> map = new TreeMap<String, Field>();

        Class<?> current = object.getClass();
        while (current != Object.class) {
            for (Field field : current.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    if (!map.containsKey(field.getName())) {
                        map.put(field.getName(), field);
                    }
                }
            }
        }
        return map;
    }

}
