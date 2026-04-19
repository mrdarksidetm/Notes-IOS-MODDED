package b7;

import ae.r;
import ae.s;
import android.media.MediaDrm;
import android.os.Build;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    static final class a extends s implements zd.a<String> {
        a() {
            super(0);
        }

        @Override // zd.a
        public final String invoke() {
            return d.this.c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String c() throws NoSuchAlgorithmException {
        MediaDrm mediaDrm = new MediaDrm(new UUID(-1301668207276963122L, -6645017420763422227L));
        byte[] propertyByteArray = mediaDrm.getPropertyByteArray("deviceUniqueId");
        r.e(propertyByteArray, "wvDrm.getPropertyByteArr…ROPERTY_DEVICE_UNIQUE_ID)");
        d(mediaDrm);
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
        r.e(messageDigest, "getInstance(\"SHA-256\")");
        messageDigest.update(propertyByteArray);
        byte[] bArrDigest = messageDigest.digest();
        r.e(bArrDigest, "md.digest()");
        return e.b(bArrDigest);
    }

    private final void d(MediaDrm mediaDrm) {
        if (Build.VERSION.SDK_INT >= 28) {
            mediaDrm.close();
        } else {
            mediaDrm.release();
        }
    }

    public final String b() {
        return (String) g7.a.a(new a(), null);
    }
}
