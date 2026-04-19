package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.w;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;

/* JADX INFO: loaded from: classes.dex */
final class o0 {
    private static final String a(String str) {
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < str.length(); i10++) {
            char cCharAt = str.charAt(i10);
            if (Character.isUpperCase(cCharAt)) {
                sb2.append("_");
            }
            sb2.append(Character.toLowerCase(cCharAt));
        }
        return sb2.toString();
    }

    private static boolean b(Object obj) {
        Object obj2;
        if (obj instanceof Boolean) {
            return !((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue() == 0;
        }
        if (obj instanceof Float) {
            return ((Float) obj).floatValue() == 0.0f;
        }
        if (obj instanceof Double) {
            return ((Double) obj).doubleValue() == 0.0d;
        }
        if (obj instanceof String) {
            obj2 = "";
        } else {
            if (!(obj instanceof g)) {
                return obj instanceof n0 ? obj == ((n0) obj).b() : (obj instanceof Enum) && ((Enum) obj).ordinal() == 0;
            }
            obj2 = g.f3561b;
        }
        return obj.equals(obj2);
    }

    static final void c(StringBuilder sb2, int i10, String str, Object obj) {
        String strA;
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                c(sb2, i10, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                c(sb2, i10, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb2.append('\n');
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(' ');
        }
        sb2.append(str);
        if (obj instanceof String) {
            sb2.append(": \"");
            strA = e1.c((String) obj);
        } else {
            if (!(obj instanceof g)) {
                if (obj instanceof w) {
                    sb2.append(" {");
                    d((w) obj, sb2, i10 + 2);
                    sb2.append("\n");
                    while (i11 < i10) {
                        sb2.append(' ');
                        i11++;
                    }
                } else {
                    if (!(obj instanceof Map.Entry)) {
                        sb2.append(": ");
                        sb2.append(obj.toString());
                        return;
                    }
                    sb2.append(" {");
                    Map.Entry entry = (Map.Entry) obj;
                    int i13 = i10 + 2;
                    c(sb2, i13, SubscriberAttributeKt.JSON_NAME_KEY, entry.getKey());
                    c(sb2, i13, "value", entry.getValue());
                    sb2.append("\n");
                    while (i11 < i10) {
                        sb2.append(' ');
                        i11++;
                    }
                }
                sb2.append("}");
                return;
            }
            sb2.append(": \"");
            strA = e1.a((g) obj);
        }
        sb2.append(strA);
        sb2.append('\"');
    }

    private static void d(n0 n0Var, StringBuilder sb2, int i10) {
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        TreeSet<String> treeSet = new TreeSet();
        for (Method method : n0Var.getClass().getDeclaredMethods()) {
            map2.put(method.getName(), method);
            if (method.getParameterTypes().length == 0) {
                map.put(method.getName(), method);
                if (method.getName().startsWith(com.amazon.a.a.o.b.au)) {
                    treeSet.add(method.getName());
                }
            }
        }
        for (String str : treeSet) {
            String strReplaceFirst = str.replaceFirst(com.amazon.a.a.o.b.au, "");
            boolean zBooleanValue = true;
            if (strReplaceFirst.endsWith("List") && !strReplaceFirst.endsWith("OrBuilderList") && !strReplaceFirst.equals("List")) {
                String str2 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 4);
                Method method2 = (Method) map.get(str);
                if (method2 != null && method2.getReturnType().equals(List.class)) {
                    c(sb2, i10, a(str2), w.A(method2, n0Var, new Object[0]));
                }
            }
            if (strReplaceFirst.endsWith("Map") && !strReplaceFirst.equals("Map")) {
                String str3 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1, strReplaceFirst.length() - 3);
                Method method3 = (Method) map.get(str);
                if (method3 != null && method3.getReturnType().equals(Map.class) && !method3.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method3.getModifiers())) {
                    c(sb2, i10, a(str3), w.A(method3, n0Var, new Object[0]));
                }
            }
            if (((Method) map2.get("set" + strReplaceFirst)) != null) {
                if (strReplaceFirst.endsWith("Bytes")) {
                    if (map.containsKey(com.amazon.a.a.o.b.au + strReplaceFirst.substring(0, strReplaceFirst.length() - 5))) {
                    }
                }
                String str4 = strReplaceFirst.substring(0, 1).toLowerCase() + strReplaceFirst.substring(1);
                Method method4 = (Method) map.get(com.amazon.a.a.o.b.au + strReplaceFirst);
                Method method5 = (Method) map.get("has" + strReplaceFirst);
                if (method4 != null) {
                    Object objA = w.A(method4, n0Var, new Object[0]);
                    if (method5 != null) {
                        zBooleanValue = ((Boolean) w.A(method5, n0Var, new Object[0])).booleanValue();
                    } else if (b(objA)) {
                        zBooleanValue = false;
                    }
                    if (zBooleanValue) {
                        c(sb2, i10, a(str4), objA);
                    }
                }
            }
        }
        if (n0Var instanceof w.c) {
            Iterator<Map.Entry<T, Object>> itS = ((w.c) n0Var).extensions.s();
            while (itS.hasNext()) {
                Map.Entry entry = (Map.Entry) itS.next();
                c(sb2, i10, "[" + ((w.d) entry.getKey()).d() + "]", entry.getValue());
            }
        }
        g1 g1Var = ((w) n0Var).unknownFields;
        if (g1Var != null) {
            g1Var.m(sb2, i10);
        }
    }

    static String e(n0 n0Var, String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("# ");
        sb2.append(str);
        d(n0Var, sb2, 0);
        return sb2.toString();
    }
}
