package com.amazon.a.a.k;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.amazon.a.a.o.c f7247a = new com.amazon.a.a.o.c("ResourceManagerImpl");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<Object> f7248b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7249c = false;

    public c() {
        a(this);
    }

    private Object a(Class<?> cls) {
        for (Object obj : this.f7248b) {
            if (cls.isAssignableFrom(obj.getClass())) {
                return obj;
            }
        }
        return null;
    }

    private void a(Object obj, Field field) {
        Class<?> type = field.getType();
        Object objA = a(type);
        com.amazon.a.a.o.a.a.b(objA, "no resource found for type: " + type);
        field.setAccessible(true);
        try {
            field.set(obj, objA);
        } catch (Exception e10) {
            com.amazon.a.a.o.a.a.a("Failed to populate field: " + field, (Throwable) e10);
        }
    }

    private boolean a(Field field) {
        return field.getAnnotation(a.class) != null;
    }

    private boolean c(Object obj) {
        com.amazon.a.a.o.a.a.a(obj, "resource");
        return a(obj.getClass()) != null;
    }

    private boolean d(Object obj) {
        return obj.getClass().getName().startsWith("com.amazon.");
    }

    @Override // com.amazon.a.a.k.b
    public void a() {
        Iterator<Object> it = this.f7248b.iterator();
        while (it.hasNext()) {
            b(it.next());
        }
    }

    @Override // com.amazon.a.a.k.b
    public void a(Object obj) {
        if (com.amazon.a.a.o.c.f7483a) {
            f7247a.a("Registering resource: " + obj);
        }
        com.amazon.a.a.o.a.a.a();
        if (this.f7249c) {
            throw new IllegalStateException("Attempt made to register resource after population has begun!");
        }
        com.amazon.a.a.o.a.a.b(c(obj), "Resource already registered: " + obj);
        this.f7248b.add(obj);
    }

    @Override // com.amazon.a.a.k.b
    public void b(Object obj) {
        com.amazon.a.a.o.a.a.a(obj, "target");
        if (com.amazon.a.a.o.c.f7483a) {
            f7247a.a("Populating: " + obj);
        }
        if (!d(obj)) {
            f7247a.a("Ignoring: " + obj + ", not a kiwi class");
            return;
        }
        for (Class<?> superclass = obj.getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
            for (Field field : superclass.getDeclaredFields()) {
                if (a(field)) {
                    a(obj, field);
                }
            }
        }
        if (obj instanceof d) {
            ((d) obj).e();
        }
    }
}
