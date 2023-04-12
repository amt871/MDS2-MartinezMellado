import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import './vista-cabecera_usuario_no_registrado';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-usuario__no_registrado_';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-buscar_usuario__no_registrado_')
export class VistaBuscar_usuario__no_registrado_ extends LitElement {
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
<vaadin-vertical-layout theme="spacing" style="width: 100%; height: 100%;">
 <vista-cabecera_usuario_no_registrado style="width: 100%; height: 5%;"></vista-cabecera_usuario_no_registrado>
 <vaadin-horizontal-layout theme="spacing" id="width: 100%; height: 95%;" style="width: 100%; height: 100%;">
  <vaadin-vertical-layout theme="spacing" style="width: 60%; height: 100%;">
   <vista-usuario__no_registrado_></vista-usuario__no_registrado_>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" style="width: 40%; height: 100%; align-items: center; justify-content: center;">
   <vaadin-text-field style="width: 60%;"></vaadin-text-field>
   <vaadin-button style="width: 60%;">
     Text Text 
   </vaadin-button>
   <vaadin-button style="width: 60%;">
     Buscar Hashtag 
   </vaadin-button>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
