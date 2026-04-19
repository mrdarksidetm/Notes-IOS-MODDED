package df;

import ae.r;
import java.util.List;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: df.a$a, reason: collision with other inner class name */
    public static final class C0233a extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final we.b<?> f10068a;

        @Override // df.a
        public we.b<?> a(List<? extends we.b<?>> list) {
            r.f(list, "typeArgumentsSerializers");
            return this.f10068a;
        }

        public final we.b<?> b() {
            return this.f10068a;
        }

        public boolean equals(Object obj) {
            return (obj instanceof C0233a) && r.b(((C0233a) obj).f10068a, this.f10068a);
        }

        public int hashCode() {
            return this.f10068a.hashCode();
        }
    }

    public static final class b extends a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l<List<? extends we.b<?>>, we.b<?>> f10069a;

        @Override // df.a
        public we.b<?> a(List<? extends we.b<?>> list) {
            r.f(list, "typeArgumentsSerializers");
            return this.f10069a.invoke(list);
        }

        public final l<List<? extends we.b<?>>, we.b<?>> b() {
            return this.f10069a;
        }
    }

    private a() {
    }

    public abstract we.b<?> a(List<? extends we.b<?>> list);
}
