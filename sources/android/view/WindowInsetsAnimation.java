package android.view;

import android.graphics.Insets;
import android.view.animation.Interpolator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class WindowInsetsAnimation {

    public final /* synthetic */ class Bounds {
        static {
            throw new NoClassDefFoundError();
        }

        public /* synthetic */ Bounds(Insets insets, Insets insets2) {
        }

        public native /* synthetic */ Insets getLowerBound();

        public native /* synthetic */ Insets getUpperBound();
    }

    public /* synthetic */ class Callback {
        static {
            throw new NoClassDefFoundError();
        }

        public /* synthetic */ Callback(int i10) {
        }
    }

    static {
        throw new NoClassDefFoundError();
    }

    public /* synthetic */ WindowInsetsAnimation(int i10, Interpolator interpolator, long j10) {
    }

    public native /* synthetic */ long getDurationMillis();

    public native /* synthetic */ float getFraction();

    public native /* synthetic */ float getInterpolatedFraction();

    public native /* synthetic */ int getTypeMask();

    public native /* synthetic */ void setFraction(float f10);
}
