package d8;

import android.app.job.JobInfo;
import d8.c;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private g8.a f9788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<u7.d, b> f9789b = new HashMap();

        public a a(u7.d dVar, b bVar) {
            this.f9789b.put(dVar, bVar);
            return this;
        }

        public f b() {
            if (this.f9788a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f9789b.keySet().size() < u7.d.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map<u7.d, b> map = this.f9789b;
            this.f9789b = new HashMap();
            return f.d(this.f9788a, map);
        }

        public a c(g8.a aVar) {
            this.f9788a = aVar;
            return this;
        }
    }

    public static abstract class b {

        public static abstract class a {
            public abstract b a();

            public abstract a b(long j10);

            public abstract a c(Set<c> set);

            public abstract a d(long j10);
        }

        public static a a() {
            return new c.b().c(Collections.emptySet());
        }

        abstract long b();

        abstract Set<c> c();

        abstract long d();
    }

    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        DEVICE_CHARGING
    }

    private long a(int i10, long j10) {
        return (long) (Math.pow(3.0d, i10 - 1) * j10 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j10 > 1 ? j10 : 2L) * ((long) r7))));
    }

    public static a b() {
        return new a();
    }

    static f d(g8.a aVar, Map<u7.d, b> map) {
        return new d8.b(aVar, map);
    }

    public static f f(g8.a aVar) {
        return b().a(u7.d.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(u7.d.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(u7.d.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    private static <T> Set<T> i(T... tArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(tArr)));
    }

    private void j(JobInfo.Builder builder, Set<c> set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.DEVICE_CHARGING)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }

    public JobInfo.Builder c(JobInfo.Builder builder, u7.d dVar, long j10, int i10) {
        builder.setMinimumLatency(g(dVar, j10, i10));
        j(builder, h().get(dVar).c());
        return builder;
    }

    abstract g8.a e();

    public long g(u7.d dVar, long j10, int i10) {
        long jA = j10 - e().a();
        b bVar = h().get(dVar);
        return Math.min(Math.max(a(i10, bVar.b()), jA), bVar.d());
    }

    abstract Map<u7.d, b> h();
}
