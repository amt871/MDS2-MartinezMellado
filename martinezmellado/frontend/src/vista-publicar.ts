import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import './vista-cabecera_comercial';
import './vista-mi_cabecera';
import 'http://localhost:49953/files/transformed/@vaadin/vaadin-ordered-layout/theme/lumo/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-publicar')
export class VistaPublicar extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;">
 <vaadin-horizontal-layout class="content" style="width: 100%; height: 5%;">
  <vista-cabecera_comercial style="width: 100%;"></vista-cabecera_comercial>
  <vista-mi_cabecera style="width: 100%;"></vista-mi_cabecera>
 </vaadin-horizontal-layout>
 <vaadin-horizontal-layout style="height: 95%; width: 100%;">
  <vaadin-vertical-layout style="height: 100%; width: 60%; align-items: center; justify-content: center;">
   <img style="height: 100%;" src="../../resources/icons/video.svg">
  </vaadin-vertical-layout>
  <vaadin-vertical-layout style="height: 100%; width: 40%; align-items: center;">
   <img style="width: 20%; height: 20%; margin-top: var(--lumo-space-xl);" src="../../resources/icons/user.svg">
   <label>Usuario</label>
   <vaadin-text-area label="Descripcion" placeholder="" style="width: 60%; height: 40%;"></vaadin-text-area>
   <vaadin-horizontal-layout theme="spacing-xl" style="justify-content: center; align-items: center; width: 100%; margin-top: var(--lumo-space-xl);">
    <vaadin-button>
     Seleccionar video
    </vaadin-button>
    <vaadin-button>
     Publicar video
    </vaadin-button>
   </vaadin-horizontal-layout>
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
