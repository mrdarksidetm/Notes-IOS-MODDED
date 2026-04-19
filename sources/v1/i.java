package v1;

import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f21935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseLongArray f21936b = new SparseLongArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseBooleanArray f21937c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<e0> f21938d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f21939e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f21940f = -1;

    private final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.f21936b.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.f21936b;
                long j10 = this.f21935a;
                this.f21935a = 1 + j10;
                sparseLongArray.put(pointerId, j10);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.f21936b.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.f21936b;
            long j11 = this.f21935a;
            this.f21935a = 1 + j11;
            sparseLongArray2.put(pointerId2, j11);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f21937c.put(pointerId2, true);
            }
        }
    }

    private final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f21939e && source == this.f21940f) {
            return;
        }
        this.f21939e = toolType;
        this.f21940f = source;
        this.f21937c.clear();
        this.f21936b.clear();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final v1.e0 d(v1.n0 r32, android.view.MotionEvent r33, int r34, boolean r35) {
        /*
            Method dump skipped, instruction units count: 288
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v1.i.d(v1.n0, android.view.MotionEvent, int, boolean):v1.e0");
    }

    private final long f(int i10) {
        long jValueAt;
        int iIndexOfKey = this.f21936b.indexOfKey(i10);
        if (iIndexOfKey >= 0) {
            jValueAt = this.f21936b.valueAt(iIndexOfKey);
        } else {
            jValueAt = this.f21935a;
            this.f21935a = 1 + jValueAt;
            this.f21936b.put(i10, jValueAt);
        }
        return a0.b(jValueAt);
    }

    private final boolean g(MotionEvent motionEvent, int i10) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i11 = 0; i11 < pointerCount; i11++) {
            if (motionEvent.getPointerId(i11) == i10) {
                return true;
            }
        }
        return false;
    }

    private final void h(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.f21937c.get(pointerId, false)) {
                this.f21936b.delete(pointerId);
                this.f21937c.delete(pointerId);
            }
        }
        if (this.f21936b.size() > motionEvent.getPointerCount()) {
            for (int size = this.f21936b.size() - 1; -1 < size; size--) {
                int iKeyAt = this.f21936b.keyAt(size);
                if (!g(motionEvent, iKeyAt)) {
                    this.f21936b.removeAt(size);
                    this.f21937c.delete(iKeyAt);
                }
            }
        }
    }

    public final d0 c(MotionEvent motionEvent, n0 n0Var) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            this.f21936b.clear();
            this.f21937c.clear();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z10 = actionMasked == 10 || actionMasked == 7 || actionMasked == 9;
        boolean z11 = actionMasked == 8;
        if (z10) {
            this.f21937c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        int actionIndex = actionMasked != 1 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
        this.f21938d.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i10 = 0;
        while (i10 < pointerCount) {
            this.f21938d.add(d(n0Var, motionEvent, i10, (z10 || i10 == actionIndex || (z11 && motionEvent.getButtonState() == 0)) ? false : true));
            i10++;
        }
        h(motionEvent);
        return new d0(motionEvent.getEventTime(), this.f21938d, motionEvent);
    }

    public final void e(int i10) {
        this.f21937c.delete(i10);
        this.f21936b.delete(i10);
    }
}
