package n2;

import t0.p3;

/* JADX INFO: loaded from: classes.dex */
public interface c1 extends p3<Object> {

    public static final class a implements c1, p3<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l f15772a;

        public a(l lVar) {
            this.f15772a = lVar;
        }

        @Override // n2.c1
        public boolean g() {
            return this.f15772a.f();
        }

        @Override // t0.p3
        public Object getValue() {
            return this.f15772a.getValue();
        }
    }

    public static final class b implements c1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f15773a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f15774b;

        public b(Object obj, boolean z10) {
            this.f15773a = obj;
            this.f15774b = z10;
        }

        public /* synthetic */ b(Object obj, boolean z10, int i10, ae.j jVar) {
            this(obj, (i10 & 2) != 0 ? true : z10);
        }

        @Override // n2.c1
        public boolean g() {
            return this.f15774b;
        }

        @Override // t0.p3
        public Object getValue() {
            return this.f15773a;
        }
    }

    boolean g();
}
