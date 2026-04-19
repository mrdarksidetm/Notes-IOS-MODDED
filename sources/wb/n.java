package wb;

/* JADX INFO: loaded from: classes2.dex */
public interface n {

    class a implements j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ i f22804a;

        a(i iVar) {
            this.f22804a = iVar;
        }

        @Override // wb.j
        public int a() {
            return this.f22804a.f22782c;
        }

        @Override // wb.j
        public boolean b() {
            return this.f22804a.F();
        }
    }

    static n b(String str, int i10, int i11) {
        return i10 == 1 ? new r(str, i11) : new p(str, i10, i11);
    }

    default void a(i iVar, Runnable runnable) {
        d(new k(iVar == null ? null : new a(iVar), runnable));
    }

    void c();

    void d(k kVar);

    void start();
}
