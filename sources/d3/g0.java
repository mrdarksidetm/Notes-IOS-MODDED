package d3;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class g0 implements Iterable<Intent> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList<Intent> f9475a = new ArrayList<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f9476b;

    public interface a {
        Intent getSupportParentActivityIntent();
    }

    private g0(Context context) {
        this.f9476b = context;
    }

    public static g0 f(Context context) {
        return new g0(context);
    }

    public g0 a(Intent intent) {
        this.f9475a.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g0 b(Activity activity) {
        Intent supportParentActivityIntent = activity instanceof a ? ((a) activity).getSupportParentActivityIntent() : null;
        if (supportParentActivityIntent == null) {
            supportParentActivityIntent = h.a(activity);
        }
        if (supportParentActivityIntent != null) {
            ComponentName component = supportParentActivityIntent.getComponent();
            if (component == null) {
                component = supportParentActivityIntent.resolveActivity(this.f9476b.getPackageManager());
            }
            d(component);
            a(supportParentActivityIntent);
        }
        return this;
    }

    public g0 d(ComponentName componentName) {
        int size = this.f9475a.size();
        try {
            Context context = this.f9476b;
            while (true) {
                Intent intentB = h.b(context, componentName);
                if (intentB == null) {
                    return this;
                }
                this.f9475a.add(size, intentB);
                context = this.f9476b;
                componentName = intentB.getComponent();
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    @Override // java.lang.Iterable
    @Deprecated
    public Iterator<Intent> iterator() {
        return this.f9475a.iterator();
    }

    public void k() {
        l(null);
    }

    public void l(Bundle bundle) {
        if (this.f9475a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f9475a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (androidx.core.content.a.startActivities(this.f9476b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f9476b.startActivity(intent);
    }
}
