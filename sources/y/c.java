package y;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.browser.customtabs.c;
import androidx.browser.customtabs.h;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import y.a;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Uri f23146a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f23148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bundle f23149d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c.d f23147b = new c.d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f23150e = new a.C0481a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f23151f = 0;

    public c(Uri uri) {
        this.f23146a = uri;
    }

    public b a(h hVar) {
        if (hVar == null) {
            throw new NullPointerException("CustomTabsSession is required for launching a TWA");
        }
        this.f23147b.i(hVar);
        Intent intent = this.f23147b.b().f2017a;
        intent.setData(this.f23146a);
        intent.putExtra("android.support.customtabs.extra.LAUNCH_AS_TRUSTED_WEB_ACTIVITY", true);
        if (this.f23148c != null) {
            intent.putExtra("android.support.customtabs.extra.ADDITIONAL_TRUSTED_ORIGINS", new ArrayList(this.f23148c));
        }
        Bundle bundle = this.f23149d;
        if (bundle != null) {
            intent.putExtra("androidx.browser.trusted.EXTRA_SPLASH_SCREEN_PARAMS", bundle);
        }
        List listEmptyList = Collections.emptyList();
        intent.putExtra("androidx.browser.trusted.extra.DISPLAY_MODE", this.f23150e.a());
        intent.putExtra("androidx.browser.trusted.extra.SCREEN_ORIENTATION", this.f23151f);
        return new b(intent, listEmptyList);
    }

    public c b(List<String> list) {
        this.f23148c = list;
        return this;
    }

    public c c(androidx.browser.customtabs.a aVar) {
        this.f23147b.e(aVar);
        return this;
    }

    public c d(a aVar) {
        this.f23150e = aVar;
        return this;
    }

    public c e(int i10) {
        this.f23151f = i10;
        return this;
    }
}
