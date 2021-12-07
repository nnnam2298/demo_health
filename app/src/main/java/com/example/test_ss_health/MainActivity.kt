package com.example.test_ss_health

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.google.android.libraries.healthdata.HealthDataService
import com.google.android.libraries.healthdata.data.*
import com.google.android.libraries.healthdata.data.IntervalDataTypes.STEPS
import com.google.android.libraries.healthdata.data.SampleDataTypes.*
import com.google.android.libraries.healthdata.device.Device
import com.google.android.libraries.healthdata.device.GetDeviceRequest
import com.google.android.libraries.healthdata.device.RegisterDeviceRequest
import com.google.android.libraries.healthdata.notification.DataChangeNotificationRequest
import com.google.android.libraries.healthdata.permission.AccessType
import com.google.android.libraries.healthdata.permission.Permission
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.time.Instant

class MainActivity : AppCompatActivity() {

    private val healthClient by lazy { HealthDataService.getClient(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val permissions = SampleDataTypes.getAllDataTypes().map {
            Permission.create(it, AccessType.READ)
        }.toMutableSet()

        healthClient.requestPermissions(permissions)
            .addListener({
                Log.i("aaa", "listened 1")
            }, {
                Log.i("aaa", "executed 1")
                getStepData()
            })
    }

    private fun getStepData() = lifecycleScope.launch {
        withContext(Dispatchers.IO) {
            val dataSpec = SampleReadSpec.builder(BLOOD_PRESSURE)
            val timeSpec = TimeSpec.builder()
                .setStartTime(Instant.ofEpochMilli(1577811600000))
                .setEndTime(Instant.now())

            val result = healthClient.readData(
                ReadDataRequest.builder().addSampleReadSpec(dataSpec.build())
                    .setTimeSpec(timeSpec.build()).build()
            )
            val data = result.get()
            val a = data.toString()
            val b = a
            val c = healthClient.localDevice
            val d = c.get()
            val e = d.device.uid
        }
    }
}
