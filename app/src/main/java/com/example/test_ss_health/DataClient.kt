package com.example.test_ss_health

import com.google.android.libraries.healthdata.HealthDataClient
import com.google.android.libraries.healthdata.data.*
import com.google.android.libraries.healthdata.device.*
import com.google.android.libraries.healthdata.notification.DataChangeNotificationRequest
import com.google.android.libraries.healthdata.permission.Permission
import com.google.common.util.concurrent.ListenableFuture

class DataClient : HealthDataClient {

    override fun deleteData(p0: DeleteDataRequest): ListenableFuture<DeleteDataResponse> {
        TODO("Not yet implemented")
    }

    override fun deleteDataRange(p0: DeleteDataRangeRequest): ListenableFuture<DeleteDataResponse> {
        TODO("Not yet implemented")
    }

    override fun getDevice(p0: GetDeviceRequest): ListenableFuture<GetDeviceResponse> {
        TODO("Not yet implemented")
    }

    override fun getDevices(): ListenableFuture<GetDevicesResponse> {
        TODO("Not yet implemented")
    }

    override fun getGrantedPermissions(p0: MutableSet<Permission>): ListenableFuture<MutableSet<Permission>> {
        TODO("Not yet implemented")
    }

    override fun getLocalDevice(): ListenableFuture<GetDeviceResponse> {
        TODO("Not yet implemented")
    }

    override fun insertData(p0: InsertDataRequest): ListenableFuture<InsertDataResponse> {
        TODO("Not yet implemented")
    }

    override fun readAggregatedData(p0: ReadAggregatedDataRequest): ListenableFuture<ReadAggregatedDataResponse> {
        TODO("Not yet implemented")
    }

    override fun readAssociatedData(p0: ReadAssociatedDataRequest): ListenableFuture<ReadAssociatedDataResponse> {
        TODO("Not yet implemented")
    }

    override fun readData(p0: ReadDataRequest): ListenableFuture<ReadDataResponse> {
        TODO("Not yet implemented")
    }

    override fun readIntervalData(p0: ReadIntervalDataRequest): ListenableFuture<ReadIntervalDataResponse> {
        TODO("Not yet implemented")
    }

    override fun readSampleData(p0: ReadSampleDataRequest): ListenableFuture<ReadSampleDataResponse> {
        TODO("Not yet implemented")
    }

    override fun readSeriesData(p0: ReadSeriesDataRequest): ListenableFuture<ReadSeriesDataResponse> {
        TODO("Not yet implemented")
    }

    override fun readTimeGroupAggregatedData(p0: ReadTimeGroupAggregatedDataRequest): ListenableFuture<ReadGroupAggregatedDataResponse> {
        TODO("Not yet implemented")
    }

    override fun registerDevice(p0: RegisterDeviceRequest): ListenableFuture<RegisterDeviceResponse> {
        TODO("Not yet implemented")
    }

    override fun requestDataChangeNotification(p0: DataChangeNotificationRequest): ListenableFuture<Void> {
        TODO("Not yet implemented")
    }

    override fun requestPermissions(p0: MutableSet<Permission>): ListenableFuture<MutableSet<Permission>> {
        TODO("Not yet implemented")
    }

    override fun updateData(p0: UpdateDataRequest): ListenableFuture<UpdateDataResponse> {
        TODO("Not yet implemented")
    }

}