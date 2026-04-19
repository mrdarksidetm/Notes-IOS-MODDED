package dd;

import android.content.Context;
import android.util.Log;
import dd.a;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import jc.a;

/* JADX INFO: loaded from: classes2.dex */
public class i implements jc.a, a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f10060a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10061a;

        static {
            int[] iArr = new int[a.d.values().length];
            f10061a = iArr;
            try {
                iArr[a.d.ROOT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10061a[a.d.MUSIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10061a[a.d.PODCASTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f10061a[a.d.RINGTONES.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f10061a[a.d.ALARMS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f10061a[a.d.NOTIFICATIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f10061a[a.d.PICTURES.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f10061a[a.d.MOVIES.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f10061a[a.d.DOWNLOADS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f10061a[a.d.DCIM.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f10061a[a.d.DOCUMENTS.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    private void z(sc.b bVar, Context context) {
        try {
            a.b.r(bVar, this);
        } catch (Exception e10) {
            Log.e("PathProviderPlugin", "Received exception while setting up PathProviderPlugin", e10);
        }
        this.f10060a = context;
    }

    @Override // dd.a.b
    public List<String> d() {
        ArrayList arrayList = new ArrayList();
        for (File file : this.f10060a.getExternalCacheDirs()) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    @Override // dd.a.b
    public String i() {
        File externalFilesDir = this.f10060a.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            return null;
        }
        return externalFilesDir.getAbsolutePath();
    }

    @Override // dd.a.b
    public String k() {
        return this.f10060a.getCacheDir().getPath();
    }

    @Override // dd.a.b
    public String l() {
        return this.f10060a.getCacheDir().getPath();
    }

    @Override // dd.a.b
    public String m() {
        return gd.b.c(this.f10060a);
    }

    @Override // jc.a
    public void onAttachedToEngine(a.b bVar) {
        z(bVar.b(), bVar.a());
    }

    @Override // jc.a
    public void onDetachedFromEngine(a.b bVar) {
        a.b.r(bVar.b(), null);
    }

    @Override // dd.a.b
    public String p() {
        return gd.b.d(this.f10060a);
    }

    @Override // dd.a.b
    public List<String> v(a.d dVar) {
        ArrayList arrayList = new ArrayList();
        for (File file : this.f10060a.getExternalFilesDirs(y(dVar))) {
            if (file != null) {
                arrayList.add(file.getAbsolutePath());
            }
        }
        return arrayList;
    }

    String y(a.d dVar) {
        switch (a.f10061a[dVar.ordinal()]) {
            case 1:
                return null;
            case 2:
                return "music";
            case 3:
                return "podcasts";
            case 4:
                return "ringtones";
            case 5:
                return "alarms";
            case 6:
                return "notifications";
            case 7:
                return "pictures";
            case 8:
                return "movies";
            case 9:
                return "downloads";
            case 10:
                return "dcim";
            case 11:
                return "documents";
            default:
                throw new RuntimeException("Unrecognized directory: " + dVar);
        }
    }
}
