package le;

import java.io.Closeable;
import qd.g;

/* JADX INFO: loaded from: classes2.dex */
public abstract class p1 extends j0 implements Closeable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f15104c = new a(null);

    public static final class a extends qd.b<j0, p1> {

        /* JADX INFO: renamed from: le.p1$a$a, reason: collision with other inner class name */
        static final class C0343a extends ae.s implements zd.l<g.b, p1> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0343a f15105a = new C0343a();

            C0343a() {
                super(1);
            }

            @Override // zd.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final p1 invoke(g.b bVar) {
                if (bVar instanceof p1) {
                    return (p1) bVar;
                }
                return null;
            }
        }

        private a() {
            super(j0.f15063b, C0343a.f15105a);
        }

        public /* synthetic */ a(ae.j jVar) {
            this();
        }
    }
}
