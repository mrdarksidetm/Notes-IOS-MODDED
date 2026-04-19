package com.amazon.a.a.n.a;

import android.os.Binder;
import android.os.RemoteException;
import com.amazon.d.a.j;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f7308a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RemoteException f7309b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private j f7310c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.amazon.d.a.h f7311d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.amazon.d.a.f f7312e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.amazon.d.a.g f7313f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f7314g = Binder.getCallingUid();

    public c(com.amazon.d.a.f fVar) {
        this.f7312e = fVar;
        try {
            this.f7308a = fVar.a();
        } catch (RemoteException e10) {
            this.f7309b = e10;
        }
    }

    public c(com.amazon.d.a.g gVar) {
        this.f7313f = gVar;
    }

    public c(com.amazon.d.a.h hVar) {
        this.f7311d = hVar;
        try {
            this.f7308a = hVar.a();
        } catch (RemoteException e10) {
            this.f7309b = e10;
        }
    }

    public c(j jVar) {
        this.f7310c = jVar;
        try {
            this.f7308a = jVar.a();
        } catch (RemoteException e10) {
            this.f7309b = e10;
        }
    }

    public String a() throws RemoteException {
        RemoteException remoteException = this.f7309b;
        if (remoteException == null) {
            return this.f7308a;
        }
        throw remoteException;
    }

    public j b() {
        return this.f7310c;
    }

    public com.amazon.d.a.h c() {
        return this.f7311d;
    }

    public com.amazon.d.a.f d() {
        return this.f7312e;
    }

    public com.amazon.d.a.g e() {
        return this.f7313f;
    }

    public int f() {
        return this.f7314g;
    }

    public String toString() {
        return "CommandResult: [CallingUid: " + this.f7314g + ", SuccessResult: " + this.f7310c + ", FailureResult: " + this.f7311d + ", DecisionResult: " + this.f7312e + ", ExceptionResult: " + this.f7313f + "]";
    }
}
