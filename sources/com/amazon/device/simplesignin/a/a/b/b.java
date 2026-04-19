package com.amazon.device.simplesignin.a.a.b;

import android.app.Activity;
import android.content.Intent;
import com.amazon.a.a.n.b.d;
import com.amazon.d.a.j;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f7942d = "SSI_LinkUserAccount";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f7943e = "1.0";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f7944f = "b";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.n.b f7945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.a.a f7946c;

    b(a aVar, LinkUserAccountRequest linkUserAccountRequest) {
        super(aVar, f7942d, "1.0");
        super.a(com.amazon.device.simplesignin.a.a.a.f7913d, linkUserAccountRequest.getPartnerUserId());
        super.a(com.amazon.device.simplesignin.a.a.a.f7910a, linkUserAccountRequest.getIdentityProviderName());
        super.a(com.amazon.device.simplesignin.a.a.a.f7914e, linkUserAccountRequest.getUserLoginName());
        super.a(com.amazon.device.simplesignin.a.a.a.f7917h, com.amazon.device.simplesignin.a.a.a.f7918i);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("token", linkUserAccountRequest.getLinkToken().getToken());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.E, linkUserAccountRequest.getLinkToken().getSchema());
            super.a(com.amazon.device.simplesignin.a.a.a.f7916g, jSONObject.toString());
            super.a(com.amazon.device.simplesignin.a.a.a.f7915f, linkUserAccountRequest.getLinkSigningKey());
        } catch (JSONException e10) {
            com.amazon.device.simplesignin.a.d.a.b(f7944f, "Unable to create linkToken json");
            throw new IllegalStateException("Unable to create linkToken json", e10);
        }
    }

    private void a(final Intent intent) {
        this.f7945b.b(d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.device.simplesignin.a.a.b.b.1
            @Override // com.amazon.a.a.n.a
            public void a() {
                try {
                    Activity activityB = b.this.f7946c.b();
                    if (activityB == null) {
                        activityB = b.this.f7946c.a();
                    }
                    com.amazon.device.simplesignin.a.d.a.a(b.f7944f, "Consent activity is about to start: " + activityB);
                    activityB.startActivity(intent);
                } catch (Exception e10) {
                    com.amazon.device.simplesignin.a.d.a.a(b.f7944f, "Exception when starting consent activity: " + e10);
                }
            }
        });
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        Map mapB = jVar.b();
        if (!mapB.containsKey(com.amazon.device.simplesignin.a.a.a.f7919j) || mapB.get(com.amazon.device.simplesignin.a.a.a.f7919j) == null) {
            return super.a(mapB);
        }
        a((Intent) mapB.get(com.amazon.device.simplesignin.a.a.a.f7919j));
        return true;
    }
}
