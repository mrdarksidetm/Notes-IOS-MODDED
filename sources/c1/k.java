package c1;

import ae.r;
import ae.s;
import zd.p;

/* JADX INFO: loaded from: classes.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j<Object, Object> f6304a = a(a.f6305a, b.f6306a);

    static final class a extends s implements p<l, Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6305a = new a();

        a() {
            super(2);
        }

        @Override // zd.p
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(l lVar, Object obj) {
            return obj;
        }
    }

    static final class b extends s implements zd.l<Object, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f6306a = new b();

        b() {
            super(1);
        }

        @Override // zd.l
        public final Object invoke(Object obj) {
            return obj;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
    public static final class c<Original, Saveable> implements j<Original, Saveable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p<l, Original, Saveable> f6307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ zd.l<Saveable, Original> f6308b;

        /* JADX WARN: Multi-variable type inference failed */
        c(p<? super l, ? super Original, ? extends Saveable> pVar, zd.l<? super Saveable, ? extends Original> lVar) {
            this.f6307a = pVar;
            this.f6308b = lVar;
        }

        @Override // c1.j
        public Saveable a(l lVar, Original original) {
            return this.f6307a.invoke(lVar, original);
        }

        @Override // c1.j
        public Original b(Saveable saveable) {
            return this.f6308b.invoke(saveable);
        }
    }

    public static final <Original, Saveable> j<Original, Saveable> a(p<? super l, ? super Original, ? extends Saveable> pVar, zd.l<? super Saveable, ? extends Original> lVar) {
        return new c(pVar, lVar);
    }

    public static final <T> j<T, Object> b() {
        j<T, Object> jVar = (j<T, Object>) f6304a;
        r.d(jVar, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.SaverKt.autoSaver, kotlin.Any>");
        return jVar;
    }
}
