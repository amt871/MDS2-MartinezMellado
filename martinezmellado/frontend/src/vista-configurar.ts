import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera_comercial';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import 'http://localhost:56773/files/transformed/@vaadin/vaadin-button/theme/lumo/vaadin-button.js';

@customElement('vista-configurar')
export class VistaConfigurar extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout style="width: 100%; height: 100%; align-items: center;">
 <vista-cabecera_comercial style="width: 100%; height: 5%;"></vista-cabecera_comercial>
 <vaadin-vertical-layout style="width: 100%; height: 95%; align-items: center; justify-content: center; align-self: center;">
  <img style="height: 10%;" src="../../resources/icons/user.svg">
  <vaadin-button>
   Cambiar
  </vaadin-button>
  <vaadin-text-field label="Usuario"></vaadin-text-field>
  <vaadin-text-field label="Nombre"></vaadin-text-field>
  <vaadin-text-field label="Fecha de nacimiento"></vaadin-text-field>
  <vaadin-text-field label="Correo electronico"></vaadin-text-field>
  <vaadin-text-field label="Descripcion"></vaadin-text-field>
  <vaadin-horizontal-layout theme="spacing-xl" style="width: 100%; align-items: flex-end; justify-content: center; align-self: center; margin-top: var(--lumo-space-xl);">
   <vaadin-button style="width: 20%;">
    Cambiar contraseña
   </vaadin-button>
   <vaadin-button style="width: 20%;">
    Guardar
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
