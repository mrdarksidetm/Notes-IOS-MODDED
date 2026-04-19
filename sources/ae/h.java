package ae;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import nd.q0;
import nd.r0;

/* JADX INFO: loaded from: classes2.dex */
public final class h implements he.c<Object>, g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f705b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<Class<? extends md.g<?>>, Integer> f706c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final HashMap<String, String> f707d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final HashMap<String, String> f708e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HashMap<String, String> f709f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map<String, String> f710g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Class<?> f711a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public final String a(Class<?> cls) {
            String str;
            r.f(cls, "jClass");
            String str2 = null;
            if (cls.isAnonymousClass() || cls.isLocalClass()) {
                return null;
            }
            if (!cls.isArray()) {
                String str3 = (String) h.f709f.get(cls.getName());
                return str3 == null ? cls.getCanonicalName() : str3;
            }
            Class<?> componentType = cls.getComponentType();
            if (componentType.isPrimitive() && (str = (String) h.f709f.get(componentType.getName())) != null) {
                str2 = str + "Array";
            }
            return str2 == null ? "kotlin.Array" : str2;
        }

        public final String b(Class<?> cls) {
            String str;
            r.f(cls, "jClass");
            String str2 = null;
            if (!cls.isAnonymousClass()) {
                if (cls.isLocalClass()) {
                    String simpleName = cls.getSimpleName();
                    Method enclosingMethod = cls.getEnclosingMethod();
                    if (enclosingMethod != null) {
                        r.c(simpleName);
                        String strN0 = je.w.N0(simpleName, enclosingMethod.getName() + '$', null, 2, null);
                        if (strN0 != null) {
                            return strN0;
                        }
                    }
                    Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
                    r.c(simpleName);
                    if (enclosingConstructor == null) {
                        return je.w.M0(simpleName, '$', null, 2, null);
                    }
                    return je.w.N0(simpleName, enclosingConstructor.getName() + '$', null, 2, null);
                }
                if (!cls.isArray()) {
                    String str3 = (String) h.f710g.get(cls.getName());
                    return str3 == null ? cls.getSimpleName() : str3;
                }
                Class<?> componentType = cls.getComponentType();
                if (componentType.isPrimitive() && (str = (String) h.f710g.get(componentType.getName())) != null) {
                    str2 = str + "Array";
                }
                if (str2 == null) {
                    return "Array";
                }
            }
            return str2;
        }

        public final boolean c(Object obj, Class<?> cls) {
            r.f(cls, "jClass");
            Map map = h.f706c;
            r.d(map, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
            Integer num = (Integer) map.get(cls);
            if (num != null) {
                return n0.k(obj, num.intValue());
            }
            if (cls.isPrimitive()) {
                cls = yd.a.b(yd.a.c(cls));
            }
            return cls.isInstance(obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        int i10 = 0;
        List listP = nd.u.p(zd.a.class, zd.l.class, zd.p.class, zd.q.class, zd.r.class, zd.s.class, zd.t.class, zd.u.class, zd.v.class, zd.w.class, zd.b.class, zd.c.class, zd.d.class, zd.e.class, zd.f.class, zd.g.class, zd.h.class, zd.i.class, zd.j.class, zd.k.class, zd.m.class, zd.n.class, zd.o.class);
        ArrayList arrayList = new ArrayList(nd.v.x(listP, 10));
        for (Object obj : listP) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                nd.u.w();
            }
            arrayList.add(md.x.a((Class) obj, Integer.valueOf(i10)));
            i10 = i11;
        }
        f706c = r0.r(arrayList);
        HashMap<String, String> map = new HashMap<>();
        map.put("boolean", "kotlin.Boolean");
        map.put("char", "kotlin.Char");
        map.put("byte", "kotlin.Byte");
        map.put("short", "kotlin.Short");
        map.put("int", "kotlin.Int");
        map.put("float", "kotlin.Float");
        map.put("long", "kotlin.Long");
        map.put("double", "kotlin.Double");
        f707d = map;
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("java.lang.Boolean", "kotlin.Boolean");
        map2.put("java.lang.Character", "kotlin.Char");
        map2.put("java.lang.Byte", "kotlin.Byte");
        map2.put("java.lang.Short", "kotlin.Short");
        map2.put("java.lang.Integer", "kotlin.Int");
        map2.put("java.lang.Float", "kotlin.Float");
        map2.put("java.lang.Long", "kotlin.Long");
        map2.put("java.lang.Double", "kotlin.Double");
        f708e = map2;
        HashMap<String, String> map3 = new HashMap<>();
        map3.put("java.lang.Object", "kotlin.Any");
        map3.put("java.lang.String", "kotlin.String");
        map3.put("java.lang.CharSequence", "kotlin.CharSequence");
        map3.put("java.lang.Throwable", "kotlin.Throwable");
        map3.put("java.lang.Cloneable", "kotlin.Cloneable");
        map3.put("java.lang.Number", "kotlin.Number");
        map3.put("java.lang.Comparable", "kotlin.Comparable");
        map3.put("java.lang.Enum", "kotlin.Enum");
        map3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        map3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        map3.put("java.util.Iterator", "kotlin.collections.Iterator");
        map3.put("java.util.Collection", "kotlin.collections.Collection");
        map3.put("java.util.List", "kotlin.collections.List");
        map3.put("java.util.Set", "kotlin.collections.Set");
        map3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        map3.put("java.util.Map", "kotlin.collections.Map");
        map3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        map3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        map3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        map3.putAll(map);
        map3.putAll(map2);
        Collection<String> collectionValues = map.values();
        r.e(collectionValues, "<get-values>(...)");
        for (String str : collectionValues) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("kotlin.jvm.internal.");
            r.c(str);
            sb2.append(je.w.P0(str, com.amazon.a.a.o.c.a.b.f7490a, null, 2, null));
            sb2.append("CompanionObject");
            md.s sVarA = md.x.a(sb2.toString(), str + ".Companion");
            map3.put(sVarA.c(), sVarA.d());
        }
        for (Map.Entry<Class<? extends md.g<?>>, Integer> entry : f706c.entrySet()) {
            map3.put(entry.getKey().getName(), "kotlin.Function" + entry.getValue().intValue());
        }
        f709f = map3;
        LinkedHashMap linkedHashMap = new LinkedHashMap(q0.b(map3.size()));
        for (Map.Entry entry2 : map3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), je.w.P0((String) entry2.getValue(), com.amazon.a.a.o.c.a.b.f7490a, null, 2, null));
        }
        f710g = linkedHashMap;
    }

    public h(Class<?> cls) {
        r.f(cls, "jClass");
        this.f711a = cls;
    }

    @Override // he.c
    public String a() {
        return f705b.a(d());
    }

    @Override // he.c
    public String b() {
        return f705b.b(d());
    }

    @Override // he.c
    public boolean c(Object obj) {
        return f705b.c(obj, d());
    }

    @Override // ae.g
    public Class<?> d() {
        return this.f711a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof h) && r.b(yd.a.b(this), yd.a.b((he.c) obj));
    }

    public int hashCode() {
        return yd.a.b(this).hashCode();
    }

    public String toString() {
        return d().toString() + " (Kotlin reflection is not available)";
    }
}
