package df;

import ae.r;
import ae.s;
import java.util.List;
import we.h;
import zd.l;

/* JADX INFO: loaded from: classes2.dex */
public interface e {

    public static final class a {

        /* JADX INFO: renamed from: df.e$a$a, reason: collision with other inner class name */
        static final class C0234a extends s implements l<List<? extends we.b<?>>, we.b<?>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ we.b<T> f10075a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0234a(we.b<T> bVar) {
                super(1);
                this.f10075a = bVar;
            }

            @Override // zd.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final we.b<?> invoke(List<? extends we.b<?>> list) {
                r.f(list, "it");
                return this.f10075a;
            }
        }

        public static <T> void a(e eVar, he.c<T> cVar, we.b<T> bVar) {
            r.f(cVar, "kClass");
            r.f(bVar, "serializer");
            eVar.b(cVar, new C0234a(bVar));
        }
    }

    <Base, Sub extends Base> void a(he.c<Base> cVar, he.c<Sub> cVar2, we.b<Sub> bVar);

    <T> void b(he.c<T> cVar, l<? super List<? extends we.b<?>>, ? extends we.b<?>> lVar);

    <Base> void c(he.c<Base> cVar, l<? super Base, ? extends h<? super Base>> lVar);

    <T> void d(he.c<T> cVar, we.b<T> bVar);

    <Base> void e(he.c<Base> cVar, l<? super String, ? extends we.a<? extends Base>> lVar);
}
