package ca;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.google.firebase.auth.FirebaseAuth;

/* JADX INFO: loaded from: classes2.dex */
public final class d1 implements ba.y0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f6641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f6642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f6643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f6644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final long f6645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f6646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private FirebaseAuth f6647g;

    public d1(String str, String str2, int i10, int i11, long j10, String str3, FirebaseAuth firebaseAuth) {
        w8.m.f(str3, "sessionInfo cannot be empty.");
        w8.m.l(firebaseAuth, "firebaseAuth cannot be null.");
        this.f6641a = w8.m.f(str, "sharedSecretKey cannot be empty. This is required to generate QR code URL.");
        this.f6642b = w8.m.f(str2, "hashAlgorithm cannot be empty.");
        this.f6643c = i10;
        this.f6644d = i11;
        this.f6645e = j10;
        this.f6646f = str3;
        this.f6647g = firebaseAuth;
    }

    private final void j(String str) {
        this.f6647g.i().l().startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)).addFlags(268435456));
    }

    @Override // ba.y0
    public final String a() {
        return this.f6642b;
    }

    @Override // ba.y0
    public final int b() {
        return this.f6643c;
    }

    @Override // ba.y0
    public final String c() {
        return this.f6646f;
    }

    @Override // ba.y0
    public final String d(String str, String str2) {
        w8.m.f(str, "accountName cannot be empty.");
        w8.m.f(str2, "issuer cannot be empty.");
        return String.format(null, "otpauth://totp/%s:%s?secret=%s&issuer=%s&algorithm=%s&digits=%d", str2, str, this.f6641a, str2, this.f6642b, Integer.valueOf(this.f6643c));
    }

    @Override // ba.y0
    public final String e() {
        return d(w8.m.f(((ba.a0) w8.m.l(this.f6647g.j(), "Current user cannot be null, since user is required to be logged in to enroll for TOTP MFA.")).t(), "Email cannot be empty, since verified email is required to use MFA."), this.f6647g.i().p());
    }

    @Override // ba.y0
    public final long f() {
        return this.f6645e;
    }

    @Override // ba.y0
    public final int g() {
        return this.f6644d;
    }

    @Override // ba.y0
    public final void h(String str) {
        w8.m.f(str, "qrCodeUrl cannot be empty.");
        try {
            j(str);
        } catch (ActivityNotFoundException unused) {
            j("https://play.google.com/store/search?q=otpauth&c=apps");
        }
    }

    @Override // ba.y0
    public final String i() {
        return this.f6641a;
    }
}
