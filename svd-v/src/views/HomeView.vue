<template xmlns="http://www.w3.org/1999/html">
  <div style="padding: 10px">
    <!--功能区域-->
    <div style="padding: 10px">
      <el-button type="primary">新增</el-button>
      <el-button type="primary">导入</el-button>
      <el-button type="primary">导出</el-button>
    </div>
    <!--搜索区域-->
    <div style="margin: 10px 0">
      <el-input v-model="search" placeholder="请输入关键字" style="width: 40%"></el-input>
      <el-button type="primary" style="margin-left: 5px">查询</el-button>
    </div>
    <!--表格区域    -->
    <div style="display: flex">
      <el-table :data="tableData" border stripe style="width: 100%">
        <el-table-column prop="id" label="ID" width="300" sortable/>
        <el-table-column prop="username" label="用户名" width="300" />
        <el-table-column prop="nickName" label="昵称" width="300" />
        <el-table-column prop="age" label="年龄" width="300" />
        <el-table-column prop="sex" label="性别" width="300" />
        <el-table-column prop="address" label="地址" width="300" />
        <el-table-column fixed="right" label="Operations" width="120">
          <template #default>
            <el-button link type="primary" size="small" @click="handleEdit">编辑</el-button>
            <el-popconfirm title="确认删除吗?">
              <template #reference>
                <el-button link type="primary" size="small">删除</el-button>
              </template>
            </el-popconfirm>
          </template>
        </el-table-column>
      </el-table>
    </div>
    <div class="demo-pagination-block" style="margin: 5px">
      <el-pagination
        v-model:currentPage="currentPage4"
        v-model:page-size="pageSize4"
        :page-sizes="[5, 10, 20]"
        :small="small"
        :disabled="disabled"
        :background="background"
        layout="total, sizes, prev, pager, next, jumper"
        :total="total"
        @size-change="handleSizeChange"
        @current-change="handleCurrentChange"/>
    </div>

    <el-dialog  v-model="dialogVisible" title="Tips" width="30%">
      <span>This is a message</span>
      <template #footer>
      <span class="dialog-footer">
        <el-button @click="dialogVisible = false">Cancel</el-button>
        <el-button type="primary" @click="dialogVisible = false"
        >Confirm</el-button
        >
      </span>
      </template>
    </el-dialog>
  </div>
</template>

<script>
// @ is an alias to /src

export default {
  dialogVisible: false,
  name: "HomeView",
  components: {

  },
  methods: {
    add() {

    },
    handleEdit() {
      console.log('编辑')
    },
    handleSizeChange() {

    },
    handleCurrentChange() {

    }
  },
  data() {
    return {
      currentPage4: 1,
      pageSize4: 1,
      total: 3,
      search: "",
      tableData: [ {
        date: '2016-05-03',
        name: '汤姆',
        address: '洛杉矶格罗夫街 189 号',
      },  {
        date: '2016-05-02',
        name: '汤姆',
        address: '洛杉矶格罗夫街 189 号',
      },  {
        date: '2016-05-04',
        name: '汤姆',
        address: '洛杉矶格罗夫街 189 号',
      },  {
        date: '2016-05-01',
        name: '汤姆',
        address: '洛杉矶格罗夫街 189 号',
      }]
    }
  }
}

</script>
