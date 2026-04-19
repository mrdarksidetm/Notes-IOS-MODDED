package r8;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.internal.p000authapi.zba;
import com.google.android.gms.internal.p000authapi.zbc;
import com.pichillilorenzo.flutter_inappwebview_android.R;

/* JADX INFO: loaded from: classes.dex */
public final class w extends zba {
    w(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void b(v vVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, vVar);
        zbc.zbc(parcelZba, googleSignInOptions);
        zbb(R.styleable.AppCompatTheme_textAppearanceListItem, parcelZba);
    }

    public final void c(v vVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, vVar);
        zbc.zbc(parcelZba, googleSignInOptions);
        zbb(R.styleable.AppCompatTheme_textAppearanceLargePopupMenu, parcelZba);
    }

    public final void f(v vVar, GoogleSignInOptions googleSignInOptions) {
        Parcel parcelZba = zba();
        zbc.zbd(parcelZba, vVar);
        zbc.zbc(parcelZba, googleSignInOptions);
        zbb(101, parcelZba);
    }
}
