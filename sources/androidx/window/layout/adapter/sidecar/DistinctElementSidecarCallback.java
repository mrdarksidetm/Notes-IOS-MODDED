package androidx.window.layout.adapter.sidecar;

import android.os.IBinder;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class DistinctElementSidecarCallback implements SidecarInterface.SidecarCallback {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SidecarDeviceState f5003b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final p5.a f5005d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final SidecarInterface.SidecarCallback f5006e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f5002a = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<IBinder, SidecarWindowLayoutInfo> f5004c = new WeakHashMap();

    DistinctElementSidecarCallback(p5.a aVar, SidecarInterface.SidecarCallback sidecarCallback) {
        this.f5005d = aVar;
        this.f5006e = sidecarCallback;
    }

    public void onDeviceStateChanged(SidecarDeviceState sidecarDeviceState) {
        if (sidecarDeviceState == null) {
            return;
        }
        synchronized (this.f5002a) {
            if (this.f5005d.a(this.f5003b, sidecarDeviceState)) {
                return;
            }
            this.f5003b = sidecarDeviceState;
            this.f5006e.onDeviceStateChanged(sidecarDeviceState);
        }
    }

    public void onWindowLayoutChanged(IBinder iBinder, SidecarWindowLayoutInfo sidecarWindowLayoutInfo) {
        synchronized (this.f5002a) {
            if (this.f5005d.d(this.f5004c.get(iBinder), sidecarWindowLayoutInfo)) {
                return;
            }
            this.f5004c.put(iBinder, sidecarWindowLayoutInfo);
            this.f5006e.onWindowLayoutChanged(iBinder, sidecarWindowLayoutInfo);
        }
    }
}
