package e7;

import android.app.ActivityManager;
import android.os.StatFs;

/* JADX INFO: loaded from: classes.dex */
public final class z implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ActivityManager f10698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StatFs f10699b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final StatFs f10700c;

    static final class a extends ae.s implements zd.a<Long> {
        a() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            return Long.valueOf(z.this.f10699b.getTotalBytes());
        }
    }

    static final class b extends ae.s implements zd.a<Long> {
        b() {
            super(0);
        }

        @Override // zd.a
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            z.this.f10698a.getMemoryInfo(memoryInfo);
            return Long.valueOf(memoryInfo.totalMem);
        }
    }

    public z(ActivityManager activityManager, StatFs statFs, StatFs statFs2) {
        ae.r.f(activityManager, "activityManager");
        ae.r.f(statFs, "internalStorageStats");
        this.f10698a = activityManager;
        this.f10699b = statFs;
        this.f10700c = statFs2;
    }

    @Override // e7.y
    public long a() {
        return ((Number) g7.a.a(new a(), 0L)).longValue();
    }

    @Override // e7.y
    public long b() {
        return ((Number) g7.a.a(new b(), 0L)).longValue();
    }
}
