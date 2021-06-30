<template>
	<div>
		<el-container>
		  <el-header>
			  <img class="headlogo" src="../assets/logo2.jpeg" >
		  </el-header>
		  <el-main>
			  <el-form :model="ruleForm" :rules="rules" ref="ruleForm" label-width="100px" class="demo-ruleForm">
			    
				<el-form-item label="用户名" prop="username">
			      <el-input v-model="ruleForm.username"></el-input>
			    </el-form-item>
				
				<el-form-item label="密码" prop="password">
				  <el-input type="password" v-model="ruleForm.password"></el-input>
				</el-form-item>	
				
				<el-form-item>
				    <el-button type="primary" @click="submitForm('ruleForm')">登录</el-button>
				    <el-button @click="resetForm('ruleForm')">重置</el-button>
				</el-form-item>
				
			  </el-form>
		  </el-main>
		</el-container>

	</div>
</template>

<script>
	export default{
		name: "Login",
		data() {
		      return {
		        ruleForm: {
		          username: '',
		          password: ''
		        },
		        rules: {
		          username: [
		            { required: true, message: '请输入用户名', trigger: 'blur' },
		            { min: 3, max: 15, message: '长度在 3 到 15 个字符', trigger: 'blur' }
		          ],
		          password: [
		            { required: true, message: '请输入密码', trigger: 'change' }
		          ],    
		        }
		      };
		    },
		methods: {
		      submitForm(formName) {
		        this.$refs[formName].validate((valid) => {
		          if (valid) {
		            alert('submit!');
		          } else {
		            console.log('error submit!!');
		            return false;
		          }
		        });
		      },
		      resetForm(formName) {
		        this.$refs[formName].resetFields();
		      }
		    }
	}
</script>

<style>	
 .el-header, .el-footer {
     /* background-color: #B3C0D1; */
     color: #333;
     text-align: center;
     line-height: 60px;
   }
   
   .el-main {
     /* background-color: #E9EEF3; */
     color: #333;
     text-align: center;
     line-height: 160px;
	 margin-top: 300px;
   }
   
   body > .el-container {
     margin-bottom: 40px;
   }
   
   .el-container:nth-child(5) .el-aside,
   .el-container:nth-child(6) .el-aside {
     line-height: 260px;
   }
   
   .el-container:nth-child(7) .el-aside {
     line-height: 320px;
   }
   
   .headlogo {
	   height: 320px;
	   margin-top: 40px;
   }
   
   .demo-ruleForm {
	   max-width: 500px;
	   margin: 0 auto;
   }

</style>
