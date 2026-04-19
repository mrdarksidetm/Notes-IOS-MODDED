package e7;

import android.hardware.Camera;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class e implements d {

    static final class a extends ae.s implements zd.a<Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f10644a = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // zd.a
        public final Integer invoke() {
            return Integer.valueOf(Camera.getNumberOfCameras());
        }
    }

    static final class b extends ae.s implements zd.a<List<? extends c>> {
        b() {
            super(0);
        }

        @Override // zd.a
        public final List<? extends c> invoke() {
            return e.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<c> c() {
        Object objB = g7.c.b(1000L, a.f10644a);
        if (md.t.g(objB)) {
            objB = 0;
        }
        int iIntValue = ((Number) objB).intValue();
        LinkedList linkedList = new LinkedList();
        for (int i10 = 0; i10 < iIntValue; i10++) {
            Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
            Camera.getCameraInfo(i10, cameraInfo);
            linkedList.add(new c(String.valueOf(i10), d(cameraInfo.facing), String.valueOf(cameraInfo.orientation)));
        }
        return linkedList;
    }

    private final String d(int i10) {
        return i10 != 0 ? i10 != 1 ? "" : "front" : "back";
    }

    @Override // e7.d
    public List<c> a() {
        return (List) g7.a.a(new b(), nd.u.m());
    }
}
