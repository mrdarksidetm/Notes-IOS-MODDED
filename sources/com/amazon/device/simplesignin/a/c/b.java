package com.amazon.device.simplesignin.a.c;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import com.amazon.device.simplesignin.ISimpleSignInResponseHandler;
import com.amazon.device.simplesignin.SimpleSignInService;
import com.amazon.device.simplesignin.a.c;
import com.amazon.device.simplesignin.model.RequestId;
import com.amazon.device.simplesignin.model.RequestStatus;
import com.amazon.device.simplesignin.model.request.LinkUserAccountRequest;
import com.amazon.device.simplesignin.model.request.SSIEventRequest;
import com.amazon.device.simplesignin.model.response.GetUserAndLinksResponse;
import com.amazon.device.simplesignin.model.response.LinkUserAccountResponse;
import com.amazon.device.simplesignin.model.response.RecordMetricsEventResponse;
import com.amazon.device.simplesignin.model.response.ShowLoginSelectionResponse;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class b implements com.amazon.device.simplesignin.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f7993a = "b";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f7994b = "com.amazon.sdktestclient";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f7995c = "com.amazon.sdktestclient.command.CommandBroker";

    private Intent a(String str) {
        Intent intent = new Intent(str);
        intent.setComponent(new ComponentName(f7994b, f7995c));
        return intent;
    }

    private GetUserAndLinksResponse a(Intent intent) {
        GetUserAndLinksResponse getUserAndLinksResponse = new GetUserAndLinksResponse();
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("getUserAndLinksOutput"));
            getUserAndLinksResponse.setRequestId(new RequestId(jSONObject.getString(com.amazon.a.a.o.b.B)));
            RequestStatus requestStatusValueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            getUserAndLinksResponse.setRequestStatus(requestStatusValueOf);
            if (!RequestStatus.SUCCESSFUL.equals(requestStatusValueOf)) {
                return getUserAndLinksResponse;
            }
            String string = jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f7911b);
            getUserAndLinksResponse.setAmazonUserId(string);
            getUserAndLinksResponse.setLinks(com.amazon.device.simplesignin.a.d.b.a(string, jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f7912c)));
        } catch (JSONException e10) {
            Log.e(f7993a, "Exception while parsing GetUserAndLinks response", e10);
        }
        return getUserAndLinksResponse;
    }

    private void a(final Object obj) {
        Context contextC = c.a().c();
        final ISimpleSignInResponseHandler iSimpleSignInResponseHandlerD = c.a().d();
        if (contextC != null && obj != null) {
            new Handler(contextC.getMainLooper()).post(new Runnable() { // from class: com.amazon.device.simplesignin.a.c.b.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Object obj2 = obj;
                        if (obj2 instanceof GetUserAndLinksResponse) {
                            iSimpleSignInResponseHandlerD.onGetUserAndLinksResponse((GetUserAndLinksResponse) obj2);
                        } else if (obj2 instanceof LinkUserAccountResponse) {
                            iSimpleSignInResponseHandlerD.onLinkUserAccountResponse((LinkUserAccountResponse) obj2);
                        } else if (obj2 instanceof ShowLoginSelectionResponse) {
                            iSimpleSignInResponseHandlerD.onShowLoginSelectionResponse((ShowLoginSelectionResponse) obj2);
                        } else if (obj2 instanceof RecordMetricsEventResponse) {
                            iSimpleSignInResponseHandlerD.onRecordMetricsEventResponse((RecordMetricsEventResponse) obj2);
                        } else {
                            Log.e(b.f7993a, "Unknown response type:" + obj.getClass().getName());
                        }
                    } catch (Exception e10) {
                        Log.e(b.f7993a, "Error in sendResponse: " + e10);
                    }
                }
            });
            return;
        }
        Log.i(f7993a, "ISimpleSignInResponseHandler is not set. Dropping response: " + obj);
    }

    private RecordMetricsEventResponse b(Intent intent) {
        RecordMetricsEventResponse recordMetricsEventResponse = new RecordMetricsEventResponse();
        try {
            JSONObject jSONObject = new JSONObject(intent.getStringExtra("recordMetricsEventOutput"));
            recordMetricsEventResponse.setRequestId(new RequestId(jSONObject.getString(com.amazon.a.a.o.b.B)));
            RequestStatus requestStatusValueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            recordMetricsEventResponse.setRequestStatus(requestStatusValueOf);
            RequestStatus.SUCCESSFUL.equals(requestStatusValueOf);
            return recordMetricsEventResponse;
        } catch (JSONException e10) {
            Log.e(f7993a, "Exception while parsing RecordMetricsEvent response", e10);
            return recordMetricsEventResponse;
        }
    }

    private LinkUserAccountResponse c(Intent intent) {
        LinkUserAccountResponse linkUserAccountResponse = new LinkUserAccountResponse();
        try {
            String stringExtra = intent.getStringExtra("linkUserAccountOutput");
            Log.i(f7993a, "SimpleSignInService : linkUserAccountOutput " + stringExtra);
            JSONObject jSONObject = new JSONObject(stringExtra);
            linkUserAccountResponse.setRequestId(new RequestId(jSONObject.getString(com.amazon.a.a.o.b.B)));
            RequestStatus requestStatusValueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            linkUserAccountResponse.setRequestStatus(requestStatusValueOf);
            if (!RequestStatus.SUCCESSFUL.equals(requestStatusValueOf)) {
                return linkUserAccountResponse;
            }
            String string = jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f7922m);
            if (!LinkUserAccountResponse.SuccessCode.ConsentDenied.equals(LinkUserAccountResponse.SuccessCode.valueOf(string))) {
                linkUserAccountResponse.setLinkId(jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f7920k));
            }
            linkUserAccountResponse.setSuccessCode(LinkUserAccountResponse.SuccessCode.valueOf(string));
        } catch (JSONException e10) {
            Log.e(f7993a, "Exception while parsing LinkUserAccount response", e10);
        }
        return linkUserAccountResponse;
    }

    private ShowLoginSelectionResponse d(Intent intent) {
        JSONObject jSONObject;
        RequestStatus requestStatusValueOf;
        ShowLoginSelectionResponse showLoginSelectionResponse = new ShowLoginSelectionResponse();
        try {
            String stringExtra = intent.getStringExtra("showLoginSelectionOutput");
            Log.i(f7993a, "SimpleSignInService : loginSelectionOutput " + stringExtra);
            jSONObject = new JSONObject(stringExtra);
            showLoginSelectionResponse.setRequestId(new RequestId(jSONObject.getString(com.amazon.a.a.o.b.B)));
            requestStatusValueOf = RequestStatus.valueOf(jSONObject.getString("status"));
            showLoginSelectionResponse.setRequestStatus(requestStatusValueOf);
        } catch (JSONException e10) {
            Log.e(f7993a, "Exception while parsing LinkUserAccount response", e10);
            showLoginSelectionResponse.setUserSelection(ShowLoginSelectionResponse.UserSelection.ManualSignIn);
        }
        if (!RequestStatus.SUCCESSFUL.equals(requestStatusValueOf)) {
            return showLoginSelectionResponse;
        }
        String string = jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f7926q);
        ShowLoginSelectionResponse.UserSelection userSelection = ShowLoginSelectionResponse.UserSelection.LoginSelected;
        if (!userSelection.name().equals(string)) {
            showLoginSelectionResponse.setUserSelection(ShowLoginSelectionResponse.UserSelection.ManualSignIn);
            return showLoginSelectionResponse;
        }
        String string2 = jSONObject.getString(com.amazon.device.simplesignin.a.a.a.f7927r);
        if (string2 != null) {
            showLoginSelectionResponse.setUserSelection(userSelection);
            showLoginSelectionResponse.setLinkId(string2);
        }
        return showLoginSelectionResponse;
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(Context context, Intent intent) {
        Object objB;
        intent.setComponent(new ComponentName(f7994b, f7995c));
        try {
            String string = intent.getExtras().getString("responseType");
            if ("com.amazon.testclient.simplesignin.getUserAndLinks".equals(string)) {
                objB = a(intent);
            } else if ("com.amazon.testclient.simplesignin.linkUserAccount".equals(string)) {
                objB = c(intent);
            } else if ("com.amazon.testclient.simplesignin.showLoginSelection".equals(string)) {
                objB = d(intent);
            } else {
                if (!"com.amazon.testclient.simplesignin.recordmetricsevent".equals(string)) {
                    Log.d(f7993a, "Unknown response type received.");
                    return;
                }
                objB = b(intent);
            }
            a(objB);
        } catch (Exception e10) {
            Log.e(f7993a, "Error handling response.", e10);
        }
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(RequestId requestId, LinkUserAccountRequest linkUserAccountRequest) {
        Log.i(f7993a, "Handling linkUserAccount sandbox request.");
        Context contextC = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.amazon.a.a.o.b.B, requestId);
            jSONObject.put("packageName", contextC.getPackageName());
            jSONObject.put(com.amazon.a.a.o.b.I, SimpleSignInService.SDK_VERSION);
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f7913d, linkUserAccountRequest.getPartnerUserId());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f7910a, linkUserAccountRequest.getIdentityProviderName());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f7914e, linkUserAccountRequest.getUserLoginName());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("token", linkUserAccountRequest.getLinkToken().getToken());
            jSONObject2.put(com.amazon.device.simplesignin.a.a.a.E, linkUserAccountRequest.getLinkToken().getSchema());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f7916g, jSONObject2.toString());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f7915f, linkUserAccountRequest.getLinkSigningKey());
            Bundle bundle = new Bundle();
            bundle.putString("linkUserAccountInput", jSONObject.toString());
            Intent intentA = a("com.amazon.testclient.simplesignin.linkUserAccount");
            intentA.addFlags(268435456);
            intentA.putExtras(bundle);
            contextC.startService(intentA);
        } catch (JSONException e10) {
            Log.e(f7993a, "Unable to create linkToken json");
            throw new IllegalStateException("Unable to create linkToken json", e10);
        }
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(RequestId requestId, SSIEventRequest sSIEventRequest) {
        Context contextC = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f7929t, sSIEventRequest.getEvent().toString());
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f7930u, sSIEventRequest.getEpochTimestamp());
            if (sSIEventRequest.getFailureReason() != null) {
                jSONObject.put(com.amazon.device.simplesignin.a.a.a.f7931v, sSIEventRequest.getFailureReason().toString());
            }
            Intent intentA = a("com.amazon.testclient.simplesignin.recordmetricsevent");
            intentA.addFlags(268435456);
            contextC.startService(intentA);
        } catch (JSONException e10) {
            Log.e(f7993a, "Error in preparing recordMetricEventInput for requestId: " + requestId, e10);
        }
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(RequestId requestId, String str) {
        Log.i(f7993a, "Handling getUserAndLinks sandbox request.");
        Context contextC = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.amazon.a.a.o.b.B, requestId);
            jSONObject.put("packageName", contextC.getPackageName());
            jSONObject.put(com.amazon.a.a.o.b.I, SimpleSignInService.SDK_VERSION);
            jSONObject.put(com.amazon.device.simplesignin.a.a.a.f7910a, str);
            Bundle bundle = new Bundle();
            bundle.putString("getUserAndLinksInput", jSONObject.toString());
            Intent intentA = a("com.amazon.testclient.simplesignin.getUserAndLinks");
            intentA.addFlags(268435456);
            intentA.putExtras(bundle);
            contextC.startService(intentA);
        } catch (JSONException unused) {
            Log.e(f7993a, "Error in preparing getUserAndLinksInput.");
        }
    }

    @Override // com.amazon.device.simplesignin.a.b
    public void a(RequestId requestId, Map<String, String> map) {
        Log.i(f7993a, "Handling showLoginSelection sandbox request.");
        Context contextC = c.a().c();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(com.amazon.a.a.o.b.B, requestId);
            jSONObject.put("packageName", contextC.getPackageName());
            jSONObject.put(com.amazon.a.a.o.b.I, SimpleSignInService.SDK_VERSION);
            Intent intentA = a("com.amazon.testclient.simplesignin.showLoginSelection");
            intentA.putExtra("showLoginSelectionInput", jSONObject.toString());
            intentA.putExtra(com.amazon.device.simplesignin.a.a.a.f7924o, new HashMap(map));
            intentA.addFlags(268435456);
            contextC.startService(intentA);
        } catch (JSONException e10) {
            Log.e(f7993a, "Unable to create showLoginSelection Input");
            throw new IllegalStateException("Unable to create showLoginSelection input json", e10);
        }
    }
}
