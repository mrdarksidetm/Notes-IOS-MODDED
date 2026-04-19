package i;

import ae.j;
import ae.r;
import android.content.Context;
import android.content.Intent;
import ge.o;
import i.a;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import md.s;
import md.x;
import nd.c0;
import nd.p;
import nd.q0;
import nd.r0;

/* JADX INFO: loaded from: classes.dex */
public final class e extends i.a<String[], Map<String, Boolean>> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f12039a = new a(null);

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }

        public final Intent a(String[] strArr) {
            r.f(strArr, "input");
            Intent intentPutExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr);
            r.e(intentPutExtra, "Intent(ACTION_REQUEST_PE…EXTRA_PERMISSIONS, input)");
            return intentPutExtra;
        }
    }

    @Override // i.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Intent createIntent(Context context, String[] strArr) {
        r.f(context, "context");
        r.f(strArr, "input");
        return f12039a.a(strArr);
    }

    @Override // i.a
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public a.C0292a<Map<String, Boolean>> getSynchronousResult(Context context, String[] strArr) {
        r.f(context, "context");
        r.f(strArr, "input");
        boolean z10 = true;
        if (strArr.length == 0) {
            return new a.C0292a<>(r0.e());
        }
        int length = strArr.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                break;
            }
            if (!(androidx.core.content.a.checkSelfPermission(context, strArr[i10]) == 0)) {
                z10 = false;
                break;
            }
            i10++;
        }
        if (!z10) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(o.d(q0.b(strArr.length), 16));
        for (String str : strArr) {
            s sVarA = x.a(str, Boolean.TRUE);
            linkedHashMap.put(sVarA.c(), sVarA.d());
        }
        return new a.C0292a<>(linkedHashMap);
    }

    @Override // i.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Map<String, Boolean> parseResult(int i10, Intent intent) {
        if (i10 == -1 && intent != null) {
            String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
            if (intArrayExtra == null || stringArrayExtra == null) {
                return r0.e();
            }
            ArrayList arrayList = new ArrayList(intArrayExtra.length);
            for (int i11 : intArrayExtra) {
                arrayList.add(Boolean.valueOf(i11 == 0));
            }
            return r0.r(c0.K0(p.I(stringArrayExtra), arrayList));
        }
        return r0.e();
    }
}
