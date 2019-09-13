<template>
    <div>
        <div id="content-wrapper">
            <div class="container-fluid header-cust" style="padding: 20px;">
                <div class="row">
                    <div class="col-md-6">
                        <h5>Data Transaksi</h5>
                    </div>
                    <div class="col-md-6">
                        <div class="form-group float-right">
                            <div class="input-with-button">
                                <input type="text" placeholder="Search.." name="keyword" value="" class="form-control"> 
                                <button class="btn-search" style="background-color: rgb(48, 151, 209);">
                                    <i class="fa fa-search" style="color: rgb(255, 255, 255);"></i>
                                </button>
                            </div>
                        </div>
                    </div>
                </div>
                <hr style="margin-top: -20px;">
                    
                <div class="table-responsive">
                    <table class="table table-striped table-bordered" id="dataTable" width="100%" cellspacing="0">
                        <thead style="background-color: #f6f6f6;">
                            <tr>
                                <th>KODE TRANS</th>
                                <th>USERNAME</th>
                                <th>TGL TRANSAKSI</th>
                                <th>TOTAL</th>
                                <th>STATUS</th>
                                <th class="text-center">#</th>
                            </tr>
                        </thead>
                        
                        <tbody>
                            <tr>
                                <td><strong>0RBMII</strong></td>
                                <td>Sarah40987</td>
                                <td>2019-09-05 09:18:39</td>
                                <td>150,000</td>
                                <td style="color:green;">Payment</td>
                                <td class="text-center">
                                    <a href="#modalTransaksi" data-toggle="modal"><i class="far fa-edit"></i></a>
                                    |
                                    <a href="#"><i class="far fa-eye"></i></a>
                                </td>
                            </tr>
                            <tr>
                                <td><strong>0RBMII</strong></td>
                                <td>Sarah40987</td>
                                <td>2019-09-05 09:18:39</td>
                                <td>150,000</td>
                                <td style="color:red;">Pending</td>
                                <td class="text-center">
                                    <a href="#"><i class="far fa-edit"></i></a>
                                    |
                                    <a href="#"><i class="far fa-eye"></i></a>
                                </td>
                            </tr>
                            <tr>
                                <td><strong>0RBMII</strong></td>
                                <td>Sarah40987</td>
                                <td>2019-09-05 09:18:39</td>
                                <td>150,000</td>
                                <td style="color:red;">Pending</td>
                                <td class="text-center">
                                    <a href="#"><i class="far fa-edit"></i></a>
                                    |
                                    <a href="#"><i class="far fa-eye"></i></a>
                                </td>
                            </tr>
                            <tr>
                                <td><strong>0RBMII</strong></td>
                                <td>Sarah40987</td>
                                <td>2019-09-05 09:18:39</td>
                                <td>150,000</td>
                                <td style="color:red;">Pending</td>
                                <td class="text-center">
                                    <a href="#"><i class="far fa-edit"></i></a>
                                    |
                                    <a href="#"><i class="far fa-eye"></i></a>
                                </td>
                            </tr>
                            <tr>
                                <td><strong>0RBMII</strong></td>
                                <td>Sarah40987</td>
                                <td>2019-09-05 09:18:39</td>
                                <td>150,000</td>
                                <td style="color:red;">Pending</td>
                                <td class="text-center">
                                    <a href="#"><i class="far fa-edit"></i></a>
                                    |
                                    <a href="#"><i class="far fa-eye"></i></a>
                                </td>
                            </tr>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>

        <!-- Modal Transaksi -->
        <div class="modal fade" id="modalTransaksi" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true" style="padding-right: 17px;">
            <div class="modal-dialog modal-sm" role="document">
                <form action="#">
                    <div class="modal-content logbox">
                        <div style="padding-bottom: 15px;">
                            <h6 class="text-center" style="padding-bottom: 15px;">Settlement</h6>
                            <p>Are you sure this transaction <strong>0RBMII</strong> has been settle ?</p>

                            <p style="font-weight:bold; margin:0;">Date:</p>
                            <input type="date" class="form-control" style="margin: 0 0 10px;">
                            <hr>
                            <p><strong>Method Payment:</strong></p>
                            <div class="form-check form-check-inline">
                                <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1" class="form-check-input" style="height: auto; width: auto;"> 
                                <label for="inlineRadio1" class="form-check-label" style="font-size: 12px;">Transfer</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1" class="form-check-input" style="height: auto; width: auto;"> 
                                <label for="inlineRadio1" class="form-check-label" style="font-size: 12px;">Debit</label>
                            </div>
                            <div class="form-check form-check-inline">
                                <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1" class="form-check-input" style="height: auto; width: auto;"> 
                                <label for="inlineRadio1" class="form-check-label" style="font-size: 12px;">Credit Card</label>
                            </div>
                        </div>
                        
                        <div class="modal-footer d-flex justify-content-center" style="border-top: none; padding-bottom: 0px;">
                            <a href="#" data-toggle="modal" data-dismiss="modal" class="btn btn-outline-success" style="margin-right: 2px; border-color: rgb(6, 167, 99);">Cancel</a> 
                            <button type="submit" class="btn btn-success" style="margin-left: 2px; background-color: rgb(6, 167, 99);">Submit</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>
    </div>
</template>


<style>

</style>

<script>
export default {
    
}
</script>