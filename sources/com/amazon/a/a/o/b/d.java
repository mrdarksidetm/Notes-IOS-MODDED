package com.amazon.a.a.o.b;

import android.app.Application;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;

/* JADX INFO: loaded from: classes.dex */
public class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final com.amazon.a.a.o.c f7469a = new com.amazon.a.a.o.c("DataAuthenticationKeyLoaderV3");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f7470b = "AppstoreAuthenticationKey.pem";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f7471c = "-----BEGIN PUBLIC KEY-----";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f7472d = "-----END PUBLIC KEY-----";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f7473e = "RSA";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private Application f7474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @com.amazon.a.a.k.a
    private com.amazon.a.a.m.c f7475g;

    private void a(PublicKey publicKey) {
        if (com.amazon.a.a.o.c.f7483a) {
            f7469a.a("Placing auth key into storage");
        }
        this.f7475g.a(com.amazon.a.a.m.c.f7274a, publicKey);
    }

    private PublicKey b() {
        if (com.amazon.a.a.o.c.f7483a) {
            f7469a.a("Checking KiwiDataStore for key...");
        }
        PublicKey publicKey = (PublicKey) this.f7475g.a(com.amazon.a.a.m.c.f7274a);
        if (com.amazon.a.a.o.c.f7483a) {
            com.amazon.a.a.o.c cVar = f7469a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Key was cached: ");
            sb2.append(publicKey != null);
            cVar.a(sb2.toString());
        }
        return publicKey;
    }

    private PublicKey c() throws Throwable {
        if (com.amazon.a.a.o.c.f7483a) {
            f7469a.a("Loading authentication key from apk...");
        }
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(this.f7474f.getAssets().open(f7470b)));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line != null) {
                            sb2.append(line);
                        } else {
                            try {
                                break;
                            } catch (IOException e10) {
                                if (com.amazon.a.a.o.c.f7483a) {
                                    f7469a.b("Failed to close stream", e10);
                                }
                            }
                        }
                    } catch (Exception e11) {
                        e = e11;
                        f7469a.b("Unable to load authentication Key", e);
                        throw com.amazon.a.a.o.b.a.a.d();
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e12) {
                                if (com.amazon.a.a.o.c.f7483a) {
                                    f7469a.b("Failed to close stream", e12);
                                }
                            }
                        }
                        throw th;
                    }
                }
                bufferedReader2.close();
                return a(sb2.toString());
            } catch (Exception e13) {
                e = e13;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.amazon.a.a.o.b.b
    public PublicKey a() throws Throwable {
        if (com.amazon.a.a.o.c.f7483a) {
            f7469a.a("Loading data authentication key...");
        }
        PublicKey publicKeyB = b();
        if (publicKeyB != null) {
            return publicKeyB;
        }
        PublicKey publicKeyC = c();
        a(publicKeyC);
        return publicKeyC;
    }

    public PublicKey a(String str) throws com.amazon.a.a.o.b.a.a {
        try {
            return KeyFactory.getInstance(f7473e).generatePublic(new X509EncodedKeySpec(com.amazon.c.a.a.c.a(str.replace(f7471c, "").replace(f7472d, ""))));
        } catch (Exception e10) {
            throw com.amazon.a.a.o.b.a.a.a((Throwable) e10);
        }
    }
}
