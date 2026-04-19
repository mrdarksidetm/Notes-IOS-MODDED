package com.amazon.device.simplesignin.a.a.d;

import android.app.Activity;
import android.content.Intent;
import com.amazon.a.a.n.b.d;
import com.amazon.d.a.j;
import com.amazon.device.simplesignin.a.a.c;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.response.ShowLoginSelectionResponse;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class b extends c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f7959d = a.class.getSimpleName();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f7960e = "SSI_ShowLoginSelection";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f7961f = "1.0";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.n.b f7962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @com.amazon.a.a.k.a
    protected com.amazon.a.a.a.a f7963c;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, String> f7964g;

    b(a aVar, Map<String, String> map) {
        super(aVar, f7960e, "1.0");
        this.f7964g = map;
    }

    private void a(final Intent intent) {
        this.f7962b.b(d.FOREGROUND, new com.amazon.a.a.n.a() { // from class: com.amazon.device.simplesignin.a.a.d.b.1
            @Override // com.amazon.a.a.n.a
            public void a() {
                try {
                    Activity activityB = b.this.f7963c.b();
                    if (activityB == null) {
                        activityB = b.this.f7963c.a();
                    }
                    com.amazon.device.simplesignin.a.d.a.a(b.f7959d, "ShowLoginSelection activity initiated through startActivity");
                    activityB.startActivity(intent);
                } catch (Exception e10) {
                    com.amazon.device.simplesignin.a.d.a.a(b.f7959d, "Exception when starting show login selection activity: " + e10);
                }
            }
        });
    }

    @Override // com.amazon.device.simplesignin.a.a.c
    protected void a(RequestStatus requestStatus) {
        com.amazon.device.simplesignin.a.a.d dVar = (com.amazon.device.simplesignin.a.a.d) j();
        ShowLoginSelectionResponse showLoginSelectionResponse = new ShowLoginSelectionResponse();
        showLoginSelectionResponse.setRequestId(dVar.e());
        if (RequestStatus.INVALID_LINK_SIGNING_KEY_ENCRYPTION.equals(requestStatus) || RequestStatus.INVALID_LINK_SIGNING_KEY.equals(requestStatus)) {
            showLoginSelectionResponse.setRequestStatus(RequestStatus.FAILURE);
        } else {
            showLoginSelectionResponse.setRequestStatus(requestStatus);
            super.a(showLoginSelectionResponse);
        }
    }

    @Override // com.amazon.a.a.n.a.h
    protected boolean b(j jVar) {
        Intent intent;
        Map mapB = jVar.b();
        if (!mapB.containsKey(com.amazon.device.simplesignin.a.a.a.f7925p) || (intent = (Intent) mapB.get(com.amazon.device.simplesignin.a.a.a.f7925p)) == null) {
            a(RequestStatus.FAILURE);
            return false;
        }
        intent.putExtra(com.amazon.device.simplesignin.a.a.a.f7924o, new HashMap(this.f7964g));
        a(intent);
        return true;
    }
}
