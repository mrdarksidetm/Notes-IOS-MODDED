package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes.dex */
public class IconCompatParcelizer {
    public static IconCompat read(androidx.versionedparcelable.a aVar) {
        IconCompat iconCompat = new IconCompat();
        iconCompat.f3314a = aVar.p(iconCompat.f3314a, 1);
        iconCompat.f3316c = aVar.j(iconCompat.f3316c, 2);
        iconCompat.f3317d = aVar.r(iconCompat.f3317d, 3);
        iconCompat.f3318e = aVar.p(iconCompat.f3318e, 4);
        iconCompat.f3319f = aVar.p(iconCompat.f3319f, 5);
        iconCompat.f3320g = (ColorStateList) aVar.r(iconCompat.f3320g, 6);
        iconCompat.f3322i = aVar.t(iconCompat.f3322i, 7);
        iconCompat.f3323j = aVar.t(iconCompat.f3323j, 8);
        iconCompat.n();
        return iconCompat;
    }

    public static void write(IconCompat iconCompat, androidx.versionedparcelable.a aVar) {
        aVar.x(true, true);
        iconCompat.o(aVar.f());
        int i10 = iconCompat.f3314a;
        if (-1 != i10) {
            aVar.F(i10, 1);
        }
        byte[] bArr = iconCompat.f3316c;
        if (bArr != null) {
            aVar.B(bArr, 2);
        }
        Parcelable parcelable = iconCompat.f3317d;
        if (parcelable != null) {
            aVar.H(parcelable, 3);
        }
        int i11 = iconCompat.f3318e;
        if (i11 != 0) {
            aVar.F(i11, 4);
        }
        int i12 = iconCompat.f3319f;
        if (i12 != 0) {
            aVar.F(i12, 5);
        }
        ColorStateList colorStateList = iconCompat.f3320g;
        if (colorStateList != null) {
            aVar.H(colorStateList, 6);
        }
        String str = iconCompat.f3322i;
        if (str != null) {
            aVar.J(str, 7);
        }
        String str2 = iconCompat.f3323j;
        if (str2 != null) {
            aVar.J(str2, 8);
        }
    }
}
