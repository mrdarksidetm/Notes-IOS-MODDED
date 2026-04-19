package androidx.credentials.playservices;

import ae.j;
import ae.r;
import ae.s;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Log;
import androidx.credentials.playservices.HiddenActivity;
import com.google.android.gms.common.api.a;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import l9.u;
import md.i0;
import n8.f;
import n8.g;
import n8.i;
import zd.l;

/* JADX INFO: loaded from: classes.dex */
public class HiddenActivity extends Activity {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f3484c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ResultReceiver f3485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f3486b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(j jVar) {
            this();
        }
    }

    static final class b extends s implements l<n8.c, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3488b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(int i10) {
            super(1);
            this.f3488b = i10;
        }

        public final void a(n8.c cVar) {
            try {
                HiddenActivity.this.f3486b = true;
                HiddenActivity.this.startIntentSenderForResult(cVar.u().getIntentSender(), this.f3488b, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e10) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.f3485a;
                r.c(resultReceiver);
                hiddenActivity.y(resultReceiver, "GET_UNKNOWN", "During begin sign in, one tap ui intent sender failure: " + e10.getMessage());
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(n8.c cVar) {
            a(cVar);
            return i0.f15558a;
        }
    }

    static final class c extends s implements l<n8.j, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3490b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10) {
            super(1);
            this.f3490b = i10;
        }

        public final void a(n8.j jVar) {
            try {
                HiddenActivity.this.f3486b = true;
                HiddenActivity.this.startIntentSenderForResult(jVar.u().getIntentSender(), this.f3490b, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e10) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.f3485a;
                r.c(resultReceiver);
                hiddenActivity.y(resultReceiver, "CREATE_UNKNOWN", "During save password, found UI intent sender failure: " + e10.getMessage());
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(n8.j jVar) {
            a(jVar);
            return i0.f15558a;
        }
    }

    static final class d extends s implements l<PendingIntent, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3492b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i10) {
            super(1);
            this.f3492b = i10;
        }

        public final void a(PendingIntent pendingIntent) {
            r.f(pendingIntent, "result");
            try {
                HiddenActivity.this.f3486b = true;
                HiddenActivity.this.startIntentSenderForResult(pendingIntent.getIntentSender(), this.f3492b, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e10) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.f3485a;
                r.c(resultReceiver);
                hiddenActivity.y(resultReceiver, "CREATE_UNKNOWN", "During public key credential, found IntentSender failure on public key creation: " + e10.getMessage());
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PendingIntent pendingIntent) {
            a(pendingIntent);
            return i0.f15558a;
        }
    }

    static final class e extends s implements l<PendingIntent, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f3494b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i10) {
            super(1);
            this.f3494b = i10;
        }

        public final void a(PendingIntent pendingIntent) {
            try {
                HiddenActivity.this.f3486b = true;
                HiddenActivity.this.startIntentSenderForResult(pendingIntent.getIntentSender(), this.f3494b, null, 0, 0, 0, null);
            } catch (IntentSender.SendIntentException e10) {
                HiddenActivity hiddenActivity = HiddenActivity.this;
                ResultReceiver resultReceiver = hiddenActivity.f3485a;
                r.c(resultReceiver);
                hiddenActivity.y(resultReceiver, "GET_UNKNOWN", "During get sign-in intent, one tap ui intent sender failure: " + e10.getMessage());
            }
        }

        @Override // zd.l
        public /* bridge */ /* synthetic */ i0 invoke(PendingIntent pendingIntent) {
            a(pendingIntent);
            return i0.f15558a;
        }
    }

    private final void l() {
        Task<n8.c> taskAddOnFailureListener;
        n8.b bVar = (n8.b) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (bVar != null) {
            Task<n8.c> taskBeginSignIn = g.b(this).beginSignIn(bVar);
            final b bVar2 = new b(intExtra);
            taskAddOnFailureListener = taskBeginSignIn.addOnSuccessListener(new OnSuccessListener() { // from class: u3.e
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    HiddenActivity.m(bVar2, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: u3.f
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    HiddenActivity.n(this.f21613a, exc);
                }
            });
        } else {
            taskAddOnFailureListener = null;
        }
        if (taskAddOnFailureListener == null) {
            Log.i("HiddenActivity", "During begin sign in, params is null, nothing to launch for begin sign in");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(l lVar, Object obj) {
        r.f(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(HiddenActivity hiddenActivity, Exception exc) {
        r.f(hiddenActivity, "this$0");
        r.f(exc, "e");
        String str = ((exc instanceof com.google.android.gms.common.api.b) && v3.a.f22023a.a().contains(Integer.valueOf(((com.google.android.gms.common.api.b) exc).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
        ResultReceiver resultReceiver = hiddenActivity.f3485a;
        r.c(resultReceiver);
        hiddenActivity.y(resultReceiver, str, "During begin sign in, failure response from one tap: " + exc.getMessage());
    }

    private final void o() {
        Task<n8.j> taskAddOnFailureListener;
        i iVar = (i) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (iVar != null) {
            Task<n8.j> taskSavePassword = g.a(this).savePassword(iVar);
            final c cVar = new c(intExtra);
            taskAddOnFailureListener = taskSavePassword.addOnSuccessListener(new OnSuccessListener() { // from class: u3.g
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    HiddenActivity.p(cVar, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: u3.h
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    HiddenActivity.q(this.f21615a, exc);
                }
            });
        } else {
            taskAddOnFailureListener = null;
        }
        if (taskAddOnFailureListener == null) {
            Log.i("HiddenActivity", "During save password, params is null, nothing to launch for create password");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(l lVar, Object obj) {
        r.f(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void q(HiddenActivity hiddenActivity, Exception exc) {
        r.f(hiddenActivity, "this$0");
        r.f(exc, "e");
        String str = ((exc instanceof com.google.android.gms.common.api.b) && v3.a.f22023a.a().contains(Integer.valueOf(((com.google.android.gms.common.api.b) exc).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
        ResultReceiver resultReceiver = hiddenActivity.f3485a;
        r.c(resultReceiver);
        hiddenActivity.y(resultReceiver, str, "During save password, found password failure response from one tap " + exc.getMessage());
    }

    private final void r() {
        Task<PendingIntent> taskAddOnFailureListener;
        u uVar = (u) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (uVar != null) {
            Task<PendingIntent> taskC = j9.a.a(this).c(uVar);
            final d dVar = new d(intExtra);
            taskAddOnFailureListener = taskC.addOnSuccessListener(new OnSuccessListener() { // from class: u3.a
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    HiddenActivity.s(dVar, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: u3.b
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    HiddenActivity.t(this.f21609a, exc);
                }
            });
        } else {
            taskAddOnFailureListener = null;
        }
        if (taskAddOnFailureListener == null) {
            Log.w("HiddenActivity", "During create public key credential, request is null, so nothing to launch for public key credentials");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(l lVar, Object obj) {
        r.f(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(HiddenActivity hiddenActivity, Exception exc) {
        r.f(hiddenActivity, "this$0");
        r.f(exc, "e");
        String str = ((exc instanceof com.google.android.gms.common.api.b) && v3.a.f22023a.a().contains(Integer.valueOf(((com.google.android.gms.common.api.b) exc).getStatusCode()))) ? "CREATE_INTERRUPTED" : "CREATE_UNKNOWN";
        ResultReceiver resultReceiver = hiddenActivity.f3485a;
        r.c(resultReceiver);
        hiddenActivity.y(resultReceiver, str, "During create public key credential, fido registration failure: " + exc.getMessage());
    }

    private final void u() {
        Task<PendingIntent> taskAddOnFailureListener;
        f fVar = (f) getIntent().getParcelableExtra("REQUEST_TYPE");
        int intExtra = getIntent().getIntExtra("ACTIVITY_REQUEST_CODE", 1);
        if (fVar != null) {
            Task<PendingIntent> signInIntent = g.b(this).getSignInIntent(fVar);
            final e eVar = new e(intExtra);
            taskAddOnFailureListener = signInIntent.addOnSuccessListener(new OnSuccessListener() { // from class: u3.c
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(Object obj) {
                    HiddenActivity.v(eVar, obj);
                }
            }).addOnFailureListener(new OnFailureListener() { // from class: u3.d
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exc) {
                    HiddenActivity.w(this.f21611a, exc);
                }
            });
        } else {
            taskAddOnFailureListener = null;
        }
        if (taskAddOnFailureListener == null) {
            Log.i("HiddenActivity", "During get sign-in intent, params is null, nothing to launch for get sign-in intent");
            finish();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(l lVar, Object obj) {
        r.f(lVar, "$tmp0");
        lVar.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(HiddenActivity hiddenActivity, Exception exc) {
        r.f(hiddenActivity, "this$0");
        r.f(exc, "e");
        String str = ((exc instanceof com.google.android.gms.common.api.b) && v3.a.f22023a.a().contains(Integer.valueOf(((com.google.android.gms.common.api.b) exc).getStatusCode()))) ? "GET_INTERRUPTED" : "GET_NO_CREDENTIALS";
        ResultReceiver resultReceiver = hiddenActivity.f3485a;
        r.c(resultReceiver);
        hiddenActivity.y(resultReceiver, str, "During get sign-in intent, failure response from one tap: " + exc.getMessage());
    }

    private final void x(Bundle bundle) {
        if (bundle != null) {
            this.f3486b = bundle.getBoolean("androidx.credentials.playservices.AWAITING_RESULT", false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void y(ResultReceiver resultReceiver, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", true);
        bundle.putString("EXCEPTION_TYPE", str);
        bundle.putString("EXCEPTION_MESSAGE", str2);
        resultReceiver.send(a.e.API_PRIORITY_OTHER, bundle);
        finish();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i10, int i11, Intent intent) {
        super.onActivityResult(i10, i11, intent);
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", false);
        bundle.putInt("ACTIVITY_REQUEST_CODE", i10);
        bundle.putParcelable("RESULT_DATA", intent);
        ResultReceiver resultReceiver = this.f3485a;
        if (resultReceiver != null) {
            resultReceiver.send(i11, bundle);
        }
        this.f3486b = false;
        finish();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        overridePendingTransition(0, 0);
        String stringExtra = getIntent().getStringExtra("TYPE");
        ResultReceiver resultReceiver = (ResultReceiver) getIntent().getParcelableExtra("RESULT_RECEIVER");
        this.f3485a = resultReceiver;
        if (resultReceiver == null) {
            finish();
        }
        x(bundle);
        if (this.f3486b) {
            return;
        }
        if (stringExtra != null) {
            switch (stringExtra.hashCode()) {
                case -441061071:
                    if (stringExtra.equals("BEGIN_SIGN_IN")) {
                        l();
                        return;
                    }
                    break;
                case 15545322:
                    if (stringExtra.equals("CREATE_PUBLIC_KEY_CREDENTIAL")) {
                        r();
                        return;
                    }
                    break;
                case 1246634622:
                    if (stringExtra.equals("CREATE_PASSWORD")) {
                        o();
                        return;
                    }
                    break;
                case 1980564212:
                    if (stringExtra.equals("SIGN_IN_INTENT")) {
                        u();
                        return;
                    }
                    break;
            }
        }
        Log.w("HiddenActivity", "Activity handed an unsupported type");
        finish();
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        r.f(bundle, "outState");
        bundle.putBoolean("androidx.credentials.playservices.AWAITING_RESULT", this.f3486b);
        super.onSaveInstanceState(bundle);
    }
}
