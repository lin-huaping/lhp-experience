<template>
  <div>
    <h1>合同管理</h1>
    <el-table :data="tableData"
              style="width: 100%">
      <el-table-column type="expand">
        <template slot-scope="props">
          <el-form label-position="left"
                   inline
                   class="demo-table-expand">
            <el-form-item label="合同ID">
              <span>{{ props.row.id }}</span>
            </el-form-item>
            <el-form-item label="甲方">
              <span>{{ props.row.part_a }}</span>
            </el-form-item>
            <el-form-item label="乙方">
              <span>{{ props.row.part_b }}</span>
            </el-form-item>
            <el-form-item label="创建时间">
              <span>{{ props.row.creatTime }}</span>
            </el-form-item>
            <el-form-item label="完成时间">
              <span>{{ props.row.finishTime }}</span>
            </el-form-item>
            <el-form-item label="服务方式">
              <span>{{ props.row.serverType }}</span>
            </el-form-item>
            <el-form-item label="金额">
              <span>{{ props.row.money }}</span>
            </el-form-item>
            <el-form-item label="支付方式">
              <span>{{ props.row.payType }}</span>
            </el-form-item>
            <el-form-item label="交易状态">
              <span>{{ props.row.moneyStatus }}</span>
            </el-form-item>
          </el-form>
        </template>
      </el-table-column>
      <el-table-column label="合同 ID"
                       prop="id">
      </el-table-column>
      <el-table-column label="甲方"
                       prop="part_a">
      </el-table-column>
      <el-table-column label="乙方"
                       prop="part_b">
      </el-table-column>
      <el-table-column label="交接人"
                       prop="seller">
      </el-table-column>
      <el-table-column label="交易状态"
                       prop="moneyStatus">
      </el-table-column>
      <el-table-column label="成交时间"
                       prop="finishTime">
      </el-table-column>

      <el-table-column label="描述"
                       prop="servername">
      </el-table-column>
    </el-table>
    <el-pagination class="bottom"
                   style="width:100%;text-align:center;margin-top:10px"
                   background
                   @current-change="handleCurrentChange"
                   :current-page="currentPage"
                   layout="prev, pager, next"
                   :total="total">
    </el-pagination>
  </div>
</template>



<script>

import { contractAdd, contractNum, contractList, contractServer, contractName } from "@/api/contract";
export default {
  created () {

    contractNum().then((success) => {
      if (success.data.status === 200) {
        // this.$message.success(success.data.message);
        this.total = success.data.data
        console.log(success);
      } else {
        this.$message.info(success.data.message);
      }
      // console.log("jljklhklh" + this.ruleForm.username);
    }).catch(error => {
      this.$message.error('出错了，请联系管理员');

    })

    this.handleCurrentChange()

  },
  data () {
    return {
      // topDate:'',
      currentPage: 1,
      // keyword: '',
      pageSize: 10,
      pageNo: 1,
      total: 100,
      tableData: [{
        id: '12987122',
        name: '好滋好味鸡蛋仔',
        category: '江浙小吃、小吃零食',
        desc: '荷兰优质淡奶，奶香浓而不腻',
        address: '上海市普陀区真北路',
        shop: '王小虎夫妻店',
        shopId: '10333'
      },]
    }
  },
  methods: {
    handleCurrentChange (e) {
      if (isNaN(parseInt(e))) {
        e = 1
      }
      this.currentPage = e
      this.pageNo = this.currentPage
      let fd = new FormData()
      fd.append('username', window.sessionStorage.getItem("username"));
      fd.append('role_id', window.sessionStorage.getItem("role_id"));
      fd.append('pageNo ', parseInt(e));
      fd.append('pageSize ', 10);

      contractList(fd).then((success) => {
        if (success.data.status === 200) {
          this.$message.success(success.data.message);
          this.tableData = success.data.data.records

          console.log(success);
        } else {
          this.$message.info(success.data.message);
        }
        // console.log("jljklhklh" + this.ruleForm.username);
      }).catch(error => {
        this.$message.error('出错了，请联系管理员');

      })
    },
  }
}
</script>



<style>
.demo-table-expand {
  font-size: 0;
}
.demo-table-expand label {
  width: 90px;
  color: #99a9bf;
}
.demo-table-expand .el-form-item {
  margin-right: 0;
  margin-bottom: 0;
  width: 50%;
}
.bottom {
  margin: 0 auto;
}
</style>