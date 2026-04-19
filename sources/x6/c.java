package x6;

import android.media.AudioAttributes;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Vibrator f23048a;

    c(Vibrator vibrator) {
        this.f23048a = vibrator;
    }

    Vibrator a() {
        return this.f23048a;
    }

    void b(long j10, int i10) {
        if (this.f23048a.hasVibrator()) {
            if (Build.VERSION.SDK_INT < 26) {
                this.f23048a.vibrate(j10);
            } else if (this.f23048a.hasAmplitudeControl()) {
                this.f23048a.vibrate(VibrationEffect.createOneShot(j10, i10), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
            } else {
                this.f23048a.vibrate(VibrationEffect.createOneShot(j10, -1), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
            }
        }
    }

    void c(List<Integer> list, int i10) {
        int size = list.size();
        long[] jArr = new long[size];
        for (int i11 = 0; i11 < size; i11++) {
            jArr[i11] = list.get(i11).intValue();
        }
        if (this.f23048a.hasVibrator()) {
            if (Build.VERSION.SDK_INT >= 26) {
                this.f23048a.vibrate(VibrationEffect.createWaveform(jArr, i10), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
            } else {
                this.f23048a.vibrate(jArr, i10);
            }
        }
    }

    void d(List<Integer> list, int i10, List<Integer> list2) {
        int size = list.size();
        long[] jArr = new long[size];
        int size2 = list2.size();
        int[] iArr = new int[size2];
        for (int i11 = 0; i11 < size; i11++) {
            jArr[i11] = list.get(i11).intValue();
        }
        for (int i12 = 0; i12 < size2; i12++) {
            iArr[i12] = list2.get(i12).intValue();
        }
        if (this.f23048a.hasVibrator()) {
            if (Build.VERSION.SDK_INT < 26) {
                this.f23048a.vibrate(jArr, i10);
            } else if (this.f23048a.hasAmplitudeControl()) {
                this.f23048a.vibrate(VibrationEffect.createWaveform(jArr, iArr, i10), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
            } else {
                this.f23048a.vibrate(VibrationEffect.createWaveform(jArr, i10), new AudioAttributes.Builder().setContentType(4).setUsage(4).build());
            }
        }
    }
}
