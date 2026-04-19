package e7;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: loaded from: classes.dex */
public final class b implements e7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f10632a;

    static final class a extends ae.s implements zd.a<String> {
        a() {
            super(0);
        }

        @Override // zd.a
        public final String invoke() throws IllegalAccessException, InvocationTargetException {
            Object objInvoke = Class.forName("com.android.internal.os.PowerProfile").getMethod("getBatteryCapacity", new Class[0]).invoke(Class.forName("com.android.internal.os.PowerProfile").getConstructor(Context.class).newInstance(b.this.f10632a), new Object[0]);
            ae.r.d(objInvoke, "null cannot be cast to non-null type kotlin.Double");
            return String.valueOf(((Double) objInvoke).doubleValue());
        }
    }

    public b(Context context) {
        ae.r.f(context, "applicationContext");
        this.f10632a = context;
    }

    private final String d(int i10) {
        switch (i10) {
            case 2:
                return "good";
            case 3:
                return "overheat";
            case 4:
                return "dead";
            case 5:
                return "over voltage";
            case 6:
                return "unspecified failure";
            case 7:
                return "cold";
            default:
                return "unknown";
        }
    }

    @Override // e7.a
    public String a() {
        return (String) g7.a.a(new a(), "");
    }

    @Override // e7.a
    public String b() {
        int intExtra;
        Intent intentRegisterReceiver = this.f10632a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        return (intentRegisterReceiver == null || (intExtra = intentRegisterReceiver.getIntExtra("health", -1)) == -1) ? "" : d(intExtra);
    }
}
