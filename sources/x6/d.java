package x6;

import android.os.Build;
import java.util.List;
import sc.i;
import sc.j;

/* JADX INFO: loaded from: classes.dex */
class d implements j.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f23049a;

    d(c cVar) {
        this.f23049a = cVar;
    }

    @Override // sc.j.c
    public void onMethodCall(i iVar, j.d dVar) {
        Boolean boolValueOf;
        String str = iVar.f20503a;
        str.hashCode();
        switch (str) {
            case "cancel":
                this.f23049a.a().cancel();
                dVar.success(null);
                return;
            case "hasAmplitudeControl":
                if (Build.VERSION.SDK_INT < 26) {
                    boolValueOf = Boolean.FALSE;
                    break;
                } else {
                    boolValueOf = Boolean.valueOf(this.f23049a.a().hasAmplitudeControl());
                    break;
                }
                break;
            case "vibrate":
                int iIntValue = ((Integer) iVar.a("duration")).intValue();
                List<Integer> list = (List) iVar.a("pattern");
                int iIntValue2 = ((Integer) iVar.a("repeat")).intValue();
                List<Integer> list2 = (List) iVar.a("intensities");
                int iIntValue3 = ((Integer) iVar.a("amplitude")).intValue();
                if (list.size() > 0 && list2.size() > 0) {
                    this.f23049a.d(list, iIntValue2, list2);
                } else if (list.size() > 0) {
                    this.f23049a.c(list, iIntValue2);
                } else {
                    this.f23049a.b(iIntValue, iIntValue3);
                }
                dVar.success(null);
                return;
            case "hasCustomVibrationsSupport":
                boolValueOf = Boolean.TRUE;
                break;
            default:
                dVar.notImplemented();
                return;
        }
        dVar.success(boolValueOf);
    }
}
