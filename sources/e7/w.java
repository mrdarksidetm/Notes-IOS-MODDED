package e7;

import android.hardware.input.InputManager;
import android.view.InputDevice;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class w implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InputManager f10694a;

    static final class a extends ae.s implements zd.a<List<? extends u>> {
        a() {
            super(0);
        }

        @Override // zd.a
        public final List<? extends u> invoke() {
            int[] inputDeviceIds = w.this.f10694a.getInputDeviceIds();
            ae.r.e(inputDeviceIds, "inputDeviceManager.inputDeviceIds");
            w wVar = w.this;
            ArrayList arrayList = new ArrayList(inputDeviceIds.length);
            for (int i10 : inputDeviceIds) {
                InputDevice inputDevice = wVar.f10694a.getInputDevice(i10);
                String strValueOf = String.valueOf(inputDevice.getVendorId());
                String name = inputDevice.getName();
                ae.r.e(name, "inputDevice.name");
                arrayList.add(new u(name, strValueOf));
            }
            return arrayList;
        }
    }

    public w(InputManager inputManager) {
        ae.r.f(inputManager, "inputDeviceManager");
        this.f10694a = inputManager;
    }

    @Override // e7.v
    public List<u> a() {
        return (List) g7.a.a(new a(), nd.u.m());
    }
}
