package s6;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class s0 extends q1 {
    public static final String A = f1.a("56270C6DBA3046438D185440284C0C22EC");

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final Set<String> f20295z;

    public s0(g0 g0Var, u6.f fVar, a0 a0Var, Set<String> set, String str, boolean z10) {
        super(g0Var, fVar, a0Var, str, z10);
        this.f20295z = set;
    }

    public static Set<String> d(Context context) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) context.getSystemService(f1.a("56270C6DBA3046438D18544028"));
        if (accessibilityManager == null) {
            return new HashSet();
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = accessibilityManager.getEnabledAccessibilityServiceList(-1);
        if (enabledAccessibilityServiceList == null || enabledAccessibilityServiceList.isEmpty()) {
            return new HashSet();
        }
        HashSet hashSet = new HashSet(enabledAccessibilityServiceList.size());
        Iterator<AccessibilityServiceInfo> it = enabledAccessibilityServiceList.iterator();
        while (it.hasNext()) {
            hashSet.add(it.next().getResolveInfo().serviceInfo.applicationInfo.packageName);
        }
        return hashSet;
    }

    @Override // s6.q1, s6.b
    public JSONObject c() throws JSONException {
        JSONObject jSONObjectC = super.c();
        if (this.f20295z != null) {
            JSONArray jSONArray = new JSONArray();
            Iterator<String> it = this.f20295z.iterator();
            while (it.hasNext()) {
                jSONArray.put(it.next());
            }
            jSONObjectC.put(f1.a("56270C6DBA3046438D185440284C0C22EC"), jSONArray);
        }
        return jSONObjectC;
    }
}
