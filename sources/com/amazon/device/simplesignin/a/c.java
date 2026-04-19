package com.amazon.device.simplesignin.a;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.amazon.a.a.o.f;
import com.amazon.device.simplesignin.ISimpleSignInResponseHandler;
import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.SSIEvent;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import com.amazon.device.simplesignin.model.request.SSIEventRequest;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f7971a = "c";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final c f7972b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final IllegalStateException f7973c = new IllegalStateException(String.format("%s. %s", "Simple Sign-In SDK not initialized", "To initialize and register responseHandler, call SimpleSignInService.registerResponseHandler()"));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Context f7974d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private ISimpleSignInResponseHandler f7975e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private b f7976f;

    private c() {
    }

    public static c a() {
        return f7972b;
    }

    private void b(LinkUserAccountRequest linkUserAccountRequest) {
        f.a(linkUserAccountRequest.getPartnerUserId(), com.amazon.device.simplesignin.a.a.a.A);
        f.a(linkUserAccountRequest.getIdentityProviderName(), com.amazon.device.simplesignin.a.a.a.f7935z);
        f.a(linkUserAccountRequest.getLinkToken(), "linkToken");
        f.a(linkUserAccountRequest.getLinkToken().getToken(), "linkToken.token");
        f.a(linkUserAccountRequest.getLinkToken().getSchema(), "linkToken.schema");
        f.a(linkUserAccountRequest.getUserLoginName(), "userLoginName");
        f.a(linkUserAccountRequest.getLinkSigningKey(), "linkSigningKey");
    }

    private boolean f() {
        return this.f7974d != null;
    }

    private void g() {
        if (f()) {
            return;
        }
        com.amazon.device.simplesignin.a.d.a.b(f7971a, "Simple Sign-In SDK not initialized.");
        throw f7973c;
    }

    public RequestId a(LinkUserAccountRequest linkUserAccountRequest) {
        g();
        b(linkUserAccountRequest);
        RequestId requestId = new RequestId();
        this.f7976f.a(requestId, linkUserAccountRequest);
        return requestId;
    }

    public RequestId a(SSIEventRequest sSIEventRequest) {
        g();
        if (sSIEventRequest.getEvent().equals(SSIEvent.LOGIN_FAILURE) && sSIEventRequest.getFailureReason() == null) {
            throw new IllegalArgumentException("failureReason must not be empty for login failure");
        }
        RequestId requestId = new RequestId();
        this.f7976f.a(requestId, sSIEventRequest);
        Log.i(f7971a, "Initiating record event with requestId : " + requestId.toString());
        return requestId;
    }

    public RequestId a(String str) {
        g();
        f.a(str, com.amazon.device.simplesignin.a.a.a.f7935z);
        RequestId requestId = new RequestId();
        this.f7976f.a(requestId, str);
        return requestId;
    }

    public RequestId a(Map<String, String> map) {
        g();
        if (map.isEmpty()) {
            throw new IllegalArgumentException("loginNames must not be empty");
        }
        RequestId requestId = new RequestId();
        this.f7976f.a(requestId, map);
        return requestId;
    }

    public void a(Context context, Intent intent) {
        this.f7976f.a(context, intent);
    }

    public void a(Context context, ISimpleSignInResponseHandler iSimpleSignInResponseHandler) {
        com.amazon.a.a.a(context.getApplicationContext());
        this.f7974d = context;
        this.f7975e = iSimpleSignInResponseHandler;
        this.f7976f = a.a().a(context);
    }

    public String b() {
        com.amazon.device.simplesignin.a.b.a aVar;
        if (f()) {
            aVar = a.a().b(this.f7974d) ? com.amazon.device.simplesignin.a.b.a.SANDBOX : com.amazon.device.simplesignin.a.b.a.PRODUCTION;
        } else {
            com.amazon.device.simplesignin.a.d.a.b(f7971a, "Application context not initialized, SDK mode is unknown.");
            aVar = com.amazon.device.simplesignin.a.b.a.UNKNOWN;
        }
        return aVar.name();
    }

    public Context c() {
        return this.f7974d;
    }

    public ISimpleSignInResponseHandler d() {
        return this.f7975e;
    }

    public b e() {
        return this.f7976f;
    }
}
