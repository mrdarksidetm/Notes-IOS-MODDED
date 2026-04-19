package rc;

import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;
import sc.j;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final sc.j f19275a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private b f19276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final j.c f19277c;

    class a implements j.c {
        a() {
        }

        @Override // sc.j.c
        public void onMethodCall(sc.i iVar, j.d dVar) {
            if (h.this.f19276b == null) {
                return;
            }
            String str = iVar.f20503a;
            str.hashCode();
            if (!str.equals("Localization.getStringResource")) {
                dVar.notImplemented();
                return;
            }
            JSONObject jSONObject = (JSONObject) iVar.b();
            try {
                dVar.success(h.this.f19276b.a(jSONObject.getString(SubscriberAttributeKt.JSON_NAME_KEY), jSONObject.has("locale") ? jSONObject.getString("locale") : null));
            } catch (JSONException e10) {
                dVar.error("error", e10.getMessage(), null);
            }
        }
    }

    public interface b {
        String a(String str, String str2);
    }

    public h(fc.a aVar) {
        a aVar2 = new a();
        this.f19277c = aVar2;
        sc.j jVar = new sc.j(aVar, "flutter/localization", sc.f.f20502a);
        this.f19275a = jVar;
        jVar.e(aVar2);
    }

    public void b(List<Locale> list) {
        cc.b.f("LocalizationChannel", "Sending Locales to Flutter.");
        ArrayList arrayList = new ArrayList();
        for (Locale locale : list) {
            cc.b.f("LocalizationChannel", "Locale (Language: " + locale.getLanguage() + ", Country: " + locale.getCountry() + ", Variant: " + locale.getVariant() + ")");
            arrayList.add(locale.getLanguage());
            arrayList.add(locale.getCountry());
            arrayList.add(locale.getScript());
            arrayList.add(locale.getVariant());
        }
        this.f19275a.c("setLocale", arrayList);
    }

    public void c(b bVar) {
        this.f19276b = bVar;
    }
}
