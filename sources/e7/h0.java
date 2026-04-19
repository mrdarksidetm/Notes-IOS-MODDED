package e7;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class h0 implements g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final SensorManager f10657a;

    static final class a extends ae.s implements zd.a<List<? extends f0>> {
        a() {
            super(0);
        }

        @Override // zd.a
        public final List<? extends f0> invoke() {
            List<Sensor> sensorList = h0.this.f10657a.getSensorList(-1);
            ae.r.e(sensorList, "sensorManager.getSensorList(Sensor.TYPE_ALL)");
            ArrayList arrayList = new ArrayList(nd.v.x(sensorList, 10));
            for (Sensor sensor : sensorList) {
                String name = sensor.getName();
                ae.r.e(name, "it.name");
                String vendor = sensor.getVendor();
                ae.r.e(vendor, "it.vendor");
                arrayList.add(new f0(name, vendor));
            }
            return arrayList;
        }
    }

    public h0(SensorManager sensorManager) {
        ae.r.f(sensorManager, "sensorManager");
        this.f10657a = sensorManager;
    }

    @Override // e7.g0
    public List<f0> a() {
        return (List) g7.a.a(new a(), nd.u.m());
    }
}
