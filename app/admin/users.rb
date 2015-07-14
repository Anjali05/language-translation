ActiveAdmin.register User do
  permit_params :email, :username, :first_name, :last_name, :location, :contact, :gender, :lang, :login_approval_at

  filter :roles
  filter :email
  filter :username
  filter :first_name
  filter :last_name
  filter :sign_in_count
  filter :last_sign_in_at
  filter :last_sign_in_ip
  filter :created_at
  filter :location
  filter :contact
  filter :gender
  filter :lang
  filter :login_approval_at

  index do
    selectable_column
    id_column
    column :email
    column :username
    column :first_name
    column :last_name
    column :last_sign_in_at
    column :created_at
    column :location
    column :contact
    column :gender
    column :lang
    column :login_approval_at
  end
end