package io.objectbox.relation;

import java.io.Serializable;
import java.lang.reflect.Field;
import jd.a;

/* JADX INFO: loaded from: classes2.dex */
public class ToOne<TARGET> implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f13326a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f13327b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Field f13328c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f13329d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f13330e;

    private Field b() {
        Field field = this.f13328c;
        if (field != null) {
            return field;
        }
        a.a();
        this.f13326a.getClass();
        throw null;
    }

    public long a() {
        if (this.f13327b) {
            return this.f13329d;
        }
        Field fieldB = b();
        try {
            Long l10 = (Long) fieldB.get(this.f13326a);
            if (l10 != null) {
                return l10.longValue();
            }
            return 0L;
        } catch (IllegalAccessException unused) {
            throw new RuntimeException("Could not access field " + fieldB);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ToOne)) {
            return false;
        }
        ToOne toOne = (ToOne) obj;
        toOne.getClass();
        return a() == toOne.a();
    }

    public int hashCode() {
        long jA = a();
        return (int) (jA ^ (jA >>> 32));
    }

    public void setTargetId(long j10) {
        if (this.f13327b) {
            this.f13329d = j10;
        } else {
            try {
                b().set(this.f13326a, Long.valueOf(j10));
            } catch (IllegalAccessException e10) {
                throw new RuntimeException("Could not update to-one ID in entity", e10);
            }
        }
        if (j10 != 0) {
            this.f13330e = false;
        }
    }
}
