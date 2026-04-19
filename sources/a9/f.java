package a9;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List f666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a9.a f667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f668c;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f669a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private a9.a f670b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Executor f671c;

        public a a(u8.b bVar) {
            this.f669a.add(bVar);
            return this;
        }

        public f b() {
            return new f(this.f669a, this.f670b, this.f671c, true, null);
        }
    }

    /* synthetic */ f(List list, a9.a aVar, Executor executor, boolean z10, k kVar) {
        w8.m.l(list, "APIs must not be null.");
        w8.m.b(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            w8.m.l(aVar, "Listener must not be null when listener executor is set.");
        }
        this.f666a = list;
        this.f667b = aVar;
        this.f668c = executor;
    }

    public static a d() {
        return new a();
    }

    public List<u8.b> a() {
        return this.f666a;
    }

    public a9.a b() {
        return this.f667b;
    }

    public Executor c() {
        return this.f668c;
    }
}
