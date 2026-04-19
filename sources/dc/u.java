package dc;

import android.util.LongSparseArray;
import android.view.MotionEvent;
import java.util.PriorityQueue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static u f10024c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final LongSparseArray<MotionEvent> f10025a = new LongSparseArray<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PriorityQueue<Long> f10026b = new PriorityQueue<>();

    public static class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final AtomicLong f10027b = new AtomicLong(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f10028a;

        private a(long j10) {
            this.f10028a = j10;
        }

        public static a b() {
            return c(f10027b.incrementAndGet());
        }

        public static a c(long j10) {
            return new a(j10);
        }

        public long d() {
            return this.f10028a;
        }
    }

    private u() {
    }

    public static u a() {
        if (f10024c == null) {
            f10024c = new u();
        }
        return f10024c;
    }

    public MotionEvent b(a aVar) {
        while (!this.f10026b.isEmpty() && this.f10026b.peek().longValue() < aVar.f10028a) {
            this.f10025a.remove(this.f10026b.poll().longValue());
        }
        if (!this.f10026b.isEmpty() && this.f10026b.peek().longValue() == aVar.f10028a) {
            this.f10026b.poll();
        }
        MotionEvent motionEvent = this.f10025a.get(aVar.f10028a);
        this.f10025a.remove(aVar.f10028a);
        return motionEvent;
    }

    public a c(MotionEvent motionEvent) {
        a aVarB = a.b();
        this.f10025a.put(aVarB.f10028a, MotionEvent.obtain(motionEvent));
        this.f10026b.add(Long.valueOf(aVarB.f10028a));
        return aVarB;
    }
}
